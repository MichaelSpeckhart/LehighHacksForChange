import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Beach extends JPanel {
  
  public char[][] image = new char[10][10];
  static Drone d;

  public Beach(String file) {
    readFile(file);
  }
  
  public void readFile(String filename){
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line;
      int row = 0;
      while ((line = br.readLine()) != null) {
          for (int col = 0; col < line.length(); col++) {
              image[row][col] = line.charAt(col);
          }
          row++;
      }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
  
  public void paint(Graphics gr) {
    super.paint(gr);
    Graphics2D g = (Graphics2D)gr;
    g.setStroke(new BasicStroke(3.0F));
    Font f = new Font("SansSerif Bold", 1, 20);
    g.setFont(f);
    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        if(image[i][j] == 'b'){
          g.setColor(Color.YELLOW);
          g.fillRect(j*50, i*50, 50, 50);
        }
        else if(image[i][j] == 'o'){
          g.setColor(Color.BLUE);
          g.fillRect(j*50, i*50, 50, 50);
        }
        else if(image[i][j] == 't'){
          g.setColor(Color.BLACK);
          g.fillRect(j*50, i*50, 50, 50);
        }
      }
    }
    g.setColor(Color.GRAY);
    g.fillRect(d.get_x()*50 + 20, d.get_y()*50 + 20, 10,10);
  }

  public void simulate(JFrame f){
    d.step();
    f.repaint();
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("The Memory Game");
    Beach m = new Beach("Drone/data.txt");
    d = new Drone(m.image);
    m.setFocusable(true);
    m.requestFocusInWindow();
    m.setSize(500, 500);
    frame.add(m);
    frame.setSize(510, 535);
    frame.setLocation(520, 185);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(3);
    frame.repaint();
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    while(!(d.get_x() == 0 && d.get_y() == 9)){
      m.simulate(frame);
    }
  }
}
