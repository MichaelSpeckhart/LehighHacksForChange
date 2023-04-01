public class Drone {
    
    // Data Members
    private String[] boundaries = new String[10];

    public Drone(char[][] image) {
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
}
