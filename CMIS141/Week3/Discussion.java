package CMIS141.Week3;

// import random  class
import java.util.Random;

public class Discussion 
{
    public static void main(String[] args)
    {
        String[] hands = {"rock", "scissors", "paper"};

        Random r = new  Random();
        for(int i = 0; i< 3; i++){
            String hand = hands[r.nextInt(3)];
            System.out.println(hand);
        }
    }
}
