package CMIS141.Week3;

// Week 3 Discussion
// Author: Soichiro Ono
// Date: 2020/11/5
// Random Rock scissors paper for for loop.

// import random  class
import java.util.Random;

public class Discussion 
{
    public static void main(String[] args)
    {
        //declare array of  hands
        String[] hands = {"rock", "scissors", "paper"};

        // make it random
        Random r = new Random();

        // loop for three times
        for(int i = 0; i< 3; i++){

            System.out.println("****************");

            // choose hand form hands array randomly.
            String hand = hands[r.nextInt(3)];

            // print  hand 
            System.out.println(hand);
        }
    }
}
