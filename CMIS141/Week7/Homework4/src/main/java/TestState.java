/**
 * Created by Soichiro Ono on 12/06/2020.
 * CMIS 141 - Homework 4a
 * This class exists so that the state can be represented
 * as an object as opposed to a multi-dimensional array.
 * The case switch assigns variable data to the State object.
 */

import java.util.Scanner;

public class TestState {

    public static void main(String[] args) {
        System.out.println("\n===Test Case #1===\n");

        // Creates a Scanner object
        Scanner input = new Scanner(System.in);
        // String used to store user input
        String stateName;

        // Loop until "none" is entered
        System.out.println("Enter a State or None sto exit: ");
        // nextLine method so that states with spaces will work
        stateName = input.nextLine();
        State state1 = new State(stateName.toLowerCase().trim());
        System.out.println(state1);
        
        System.out.println("\n---End Test Case #1---\n");



        System.out.println("\n===Test Case #2===\n");
        // Creates a Scanner object
        Scanner input2 = new Scanner(System.in);
        // String used to store user input
        String stateName2;

        // Loop until "none" is entered
        System.out.println("Enter a State or None to exit: ");
        // nextLine method so that states with spaces will work
        stateName2 = input2.nextLine();
        State state2 = new State(stateName2.toLowerCase().trim());
        System.out.println(state2);
        System.out.println("\n---End Test Case #2---\n");




        System.out.println("\n===Test Case #3===\n");
        // Creates a Scanner object
        Scanner input3 = new Scanner(System.in);
        // String used to store user input
        String stateName3;

        // Loop until "none" is entered
        System.out.println("Enter a State or None to exit: ");
        // nextLine method so that states with spaces will work
        stateName3 = input3.nextLine();
        State state3 = new State(stateName3.toLowerCase().trim());
        System.out.println(state3);
        System.out.println("\n---End Test Case #3---\n");

        System.out.println("\n A summary report for each State, Bird, and Flower is:"
        + state1 + state2 + "\n Please visit our site again!"
        );


    }



}
