public class Drone {
    
    // Data Members
    private String[] boundaries = new String[10];
    private int x,y;
    private int x_velocity;

    private char[][] image = new char [10][10];
    public Drone(char[][] a_image) {
        image = a_image;
        x = 0;
        y = 0;
        x_velocity = 1;
        int boundaryRow = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 'o') {
                    boundaries[boundaryRow] = String.format("(%d, %d)", i, j);
                    j = image[i].length;
                    boundaryRow++;
                }
            }
        }

        for (int i = 0; i < boundaries.length; i++) {
            System.out.println(boundaries[i]);
        }

    }

    public int get_x(){
        return x;
    }

    public int get_y(){
        return y;
    }

    public void step(){
        //Rules
        //If forward and right is ocean, turn around, increase y, velocity x
        //
        System.out.println("x:"+x+",y:"+y+", image:"+image[y][x]+" x_vel:"+x_velocity);
        if(x == 0 && y != 0 && x_velocity == -1){
            y = y + 1;
            x_velocity = 1;
        }
        else if(image[y][x+x_velocity] != 'o'){
            x = x + x_velocity;
        }
        else if(image[y][x+x_velocity] == 'o' && image[y+1][x] != 'o'){
            x = x + x_velocity;
        }
        else if(image[y][x+x_velocity] == 'o' && image[y+1][x+x_velocity] == 'o'){
            x_velocity = -1;
            y = y + 1;
        }
    }


}
