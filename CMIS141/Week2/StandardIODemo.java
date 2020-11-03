// Import each required Java class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner; 

/*
    Standard I/O Demo
*/

public class StandardIODemo 
{
    public static void main(String[] args) throws IOException
    {
        //variables to hold values
        int favInt = 0; 
        double favDouble = 0.0; 
        int secondfavInt = 0; 
        double secondfavDouble = 0.0;
        boolean myBoolean = false;
        short myShort = 0;

        //Define a InputStreamReader based on Standard Input (System.in)
        InputStreamReader isReader = new InputStreamReader(System.in); 
        // Send the InputStreamReader to a BufferedReader
        BufferedReader stdin ~ new BufferedReader(isReader);

        //Prompt the user to enter an int
        System.out.println("Enter your favorite integer:"); 
        //The readLine() method reads everything entered 
        // However the Integer.parseInt() method converts 
        // the value to an int
        favInt = Integer.parseInt(stdin.readLine()); 

        //Prompt the user to enter a double 
        System.out.println("Enter your favorite double number:");
        // Read the line and convert to a double 
        favDouble = Double.ParseDouble(stdin.readLine());

        //Print the results to verify your data 
        System.out.println("Your favorite int is:" + favInt); 
        System.out.println("Your favorite double is:" + favDouble); 
        
        //Use the Scanner class to perform the same functionality  
        Scanner scannerIn = new Scanner(System.in);

        //Prompt the user to enter another int 
        System.out.println("Enter your second favorite interger:"); 
        // the nextInt() method scans the next int value  
        secondfavInt = scannerIn.nextInt(); 

        //Prompt the user to enter another double 
        System.out.println("Enter your second favorite double:"); 
        // the nextInt() method scans the next double value  
        secondfavDouble = scannerIn.nextDouble(); 

        // Prompt the user toenter a boolean
        System.out.println("Enter your favorite boolean value:"); 
        // the nextBoolean() method scans the next boolean value  
        myBoolean = scannerIn.nextBoolean();

        //Prompt the user to enter a short 
        System.out.println("Enter your second favorite short:"); 
        // the nextInt() method scans the next short value  
        myShort = scannerIn.nextShort(); 

        //Print the results to verify your data 
        System.out.println("Your second favorite int is : "+ secondfavInt);
        System.out.println("Your second favorite double is : "+ secondfavDouble);
        System.out.println("Your second favorite boolean is : "+ myBoolean);
        System.out.println("Your second favorite short is : "+ myShort);
    }
}