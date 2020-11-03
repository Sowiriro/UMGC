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
        double studentEmplid = 0.0; 
        double quiz1PersentageScore = 0.0; 
        double quiz2PersentageScore = 0.0; 
        double quiz3PersentageScore = 0.0; 
        int yourAgeInMonth = 0;
        double TemperatureInDegreeCelsius = 0.0;

        InputStreamReader isReader = new InputStreamReader(System.in); 
        BufferedReader stdin = new BufferedReader(isReader);

        System.out.println("Enter your your Student EMPLID(0 - 999999):"); 
        
        studentEmplid = Double.parseDouble(stdin.readLine()); 

        System.out.println("Enter your quiz1 percentage score (0.0 – 100.0):");

        quiz1PersentageScore = Double.parseDouble(stdin.readLine());

        Scanner scannerIn = new Scanner(System.in);

        //Prompt the user to enter another int 
        System.out.println("Enter your quiz 2 percentage score(0.0 - 100.0):"); 
        // the nextInt() method scans the next int value  
        quiz2PersentageScore = scannerIn.nextDouble(); 

        //Prompt the user to enter another double 
        System.out.println("Enter your quiz 3 percentage score(0.0 - 100.0):"); 
        // the nextInt() method scans the next double value  
        quiz3PersentageScore = scannerIn.nextDouble(); 

        // Prompt the user toenter a boolean
        System.out.println("Enter your age in months (0-1440):"); 
        // the nextBoolean() method scans the next boolean value  
        yourAgeInMonth = scannerIn.nextInt();

        //Prompt the user to enter a short 
        System.out.println("Enter the current Temperature in degrees Celsius:"); 
        // the nextInt() method scans the next short value  
        TemperatureInDegreeCelsius = scannerIn.nextShort(); 


        //Print the results to verify your data 
        System.out.println("Student EMPLID: "+ secondfavInt);
        System.out.println("Quiz 1 Score:"+ secondfavDouble);
        System.out.println("Quiz 2 Score: "+ myBoolean);
        System.out.println("Quiz 3 Score: "+ myShort);
        System.out.println("Average quiz score: "+ secondfavInt);
        System.out.println("Age in months: "+ secondfavDouble);
        System.out.println("Age in years: "+ myBoolean);
        System.out.println("Temperature in Celsius: "+ myShort);
        System.out.println("Temperature in Fahrenheit: "+ myShort);
    }
}