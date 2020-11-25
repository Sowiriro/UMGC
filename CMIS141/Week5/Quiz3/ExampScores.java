
import java.util.Random;
import java.util.Arrays; 


public class ExampScores {
    public static void main(String[] args){
        int[] examScores = new int[100];

        Random rand = new Random();

        for(int i=0; i < examScores.length; i++){
            examScores[i] = rand.nextInt(101); ;
            System.out.println(examScores[i]);
    }

    Arrays.sort(examScores);
    int num = Arrays.binarySearch(examScores, 50);
    System.out.println("----------------------------------------------");
    System.out.println(num);
    }
}
