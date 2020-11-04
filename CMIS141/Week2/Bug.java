package CMIS141.Week2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bug {
    public static void main(String[] args) throws IOException
    {

        // declare values
        String fruitName;
        int num = 0;

        // make InputStreamReader to be able to read
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isReader);


        //prompt to enter the user's number
        System.out.println("Enter the number(1 - 3):");
        num = Integer.parseInt(stdin.readLine());


        //Switch 
        switch (num) {
            case 1:
              fruitName = "orange";
            case 2:
              fruitName = "lemon";
                     break;
            case 3:
                fruitName = "apple";
                    break;
            default:
             fruitName = "Invalid num";
                     break;
        }

        // display what user get
        System.out.println(fruitName);
    }

}
