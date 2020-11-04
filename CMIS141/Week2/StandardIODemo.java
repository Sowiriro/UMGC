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
        double averageQuizScore = 0.0;
        int yourAgeInMonth = 0;
        double TemperatureInDegreeCelsius = 0.0;

        InputStreamReader isReader = new InputStreamReader(System.in); 
        BufferedReader stdin = new BufferedReader(isReader);


        //prompt the user's Student EMPLID
        System.out.println("Enter your your Student EMPLID(0 - 999999):"); 
        studentEmplid = Double.parseDouble(stdin.readLine()); 

        //prompt the users quiz 1
        System.out.println("Enter your quiz1 percentage score (0.0 – 100.0):");
        quiz1PersentageScore = Double.parseDouble(stdin.readLine());

        // For  functionally 
        Scanner scannerIn = new Scanner(System.in);

        //Prompt the user's quiz 2
        System.out.println("Enter your quiz 2 percentage score(0.0 - 100.0):"); 
        quiz2PersentageScore = scannerIn.nextDouble(); 

        //Prompt the user's quiz 3
        System.out.println("Enter your quiz 3 percentage score(0.0 - 100.0):"); 
        quiz3PersentageScore = scannerIn.nextDouble(); 

        averageQuizScore = CalcusAverage(quiz1PersentageScore, quiz2PersentageScore, quiz3PersentageScore);

        //Prompt the user age in month
        System.out.println("Enter your age in months (0-1440):"); 
        yourAgeInMonth = scannerIn.nextInt();

        //Prompt the user's TemperatureInDegreeCelsius
        System.out.println("Enter the current Temperature in degrees Celsius:"); 
        TemperatureInDegreeCelsius = scannerIn.nextDouble(); 


        //Print the results to verify your data 
        System.out.println("Student EMPLID: "+ studentEmplid);
        System.out.println("Quiz 1 Score:"+ quiz1PersentageScore);
        System.out.println("Quiz 2 Score: "+ quiz2PersentageScore);
        System.out.println("Quiz 3 Score: "+ quiz3PersentageScore);
        System.out.println("Average quiz score: "+ averageQuizScore);
        System.out.println("Age in months: "+ yourAgeInMonth);
        // System.out.println("Age in years: "+ );
        System.out.println("Temperature in Celsius: "+ TemperatureInDegreeCelsius + "°");
        // System.out.println("Temperature in Fahrenheit: "+ myShort);
    }

    // to calucurate average from quiz sum
    public static double CalcusAverage(double quiz1PersentageScore, double quiz2PersentageScore, double quiz3PersentageScore)
    {
        double averageQuizScore = 0.0;
        averageQuizScore = (quiz1PersentageScore + quiz2PersentageScore + quiz3PersentageScore) / 3;
        return averageQuizScore;
    }
    
}