
import java.util.Random;

public class RandomArray {
    public static void main(String[]args) {


        Random rand = new Random();

        final int row = 5;
        final int col = 10;
        int [][] grid = new int [row][col];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = rand.nextInt(20);
                System.out.println(grid[i][j]);
            }
        }

    }
}
