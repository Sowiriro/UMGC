package CMIS141.Week3;

// import random  class
import java.util.Random;

public class Discussion 
{
    public static void main(String[] args)
    {
        //declare list of  hands
        String[] hands = {"rock", "scissors", "paper"};

        // make it random
        Random r = new Random();

        // loop for three times
        for(int i = 0; i< 3; i++){

            // choose hand form hands list randomly.
            String hand = hands[r.nextInt(3)];

            // print  hand 
            System.out.println(hand);
        }
    }
}
