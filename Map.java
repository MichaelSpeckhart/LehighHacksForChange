package Drone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {

    private char[][] earth = new char[10][10];

    Map(String filename) {
        readMap(filename);
    }

    public char[][] getEarth() {
        return earth;
    }


    private void readMap(String filename) { //reads text file of beach data into 2d char array
        File file = new File(filename);
        try {
            Scanner fileScan = new Scanner(file);

            int currRow = 0;
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                char[] curr = line.toCharArray();

                for (int i = 0; i < curr.length; i++) {
                    earth[currRow][i] = curr[i];
                }
                currRow++;
            }
            fileScan.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
