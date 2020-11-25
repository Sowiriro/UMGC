import java.util.Random;

public class MultiArray {
    public static void main(String[]args) {


        Random rand = new Random();

        final int row = 3;
        final int col1 = 3;
        final int col2 = 3;
        int [][][] grid = new int [row][col1][col2];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                for(int k = 0; k < grid[i][j].length; k++){
                    grid[i][j][k] = rand.nextInt(3);
                    System.out.println(grid[i][j][k]);
                }
            }
        }

    }
}
