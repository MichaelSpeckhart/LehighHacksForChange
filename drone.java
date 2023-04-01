package Drone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class drone {


    // Data Members
    private Map map;
    private String[] boundaries = new String[10];

    public drone(String filename) {
        map = new Map("data.txt");

        char[][] picture = map.getEarth();
        int boundaryRow = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length; j++) {
                if (picture[i][j] == 'o') {
                    boundaries[boundaryRow] = String.format("(%d, %d)", i, j);
                    continue;
                }
            }
        }

        for (int i = 0; i < boundaries.length; i++) {
            System.out.println(boundaries[i]);
        }

    }




    public static void main(String[] args) {
        drone d = new drone("data.txt");
    }
}