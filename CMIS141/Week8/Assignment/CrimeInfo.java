
/*
* File: CrimeInfo.java
* Author: Soichiro Ono
* Date: 12/15/2020
* Class: UMUC 141 Professor Angelo Luo
*/

import java.util.*;
import java.io.*;

public class CrimeInfo
{

    public static void main(String[] args) throws IOException
    {
    	
    	//Initializing some values.
        Scanner scan = new Scanner(System.in);
    	String firstArg = "";
    	File myFile ;
    	Scanner fileIn;
    	long start = System.currentTimeMillis();
    	String input;
        USCrimeClass crimeStats = new USCrimeClass();



    	//Section for checking Args and attempting to open the file.  Verification they exist.  
    	if (args.length > 0) {
        	try {
            	firstArg = args[0];
            	myFile = new File(firstArg);
                fileIn = new Scanner(myFile);
            } catch (FileNotFoundException e) {
            	//Block if the file is not found.
            	System.err.println("Argument " + args[0] + " must be a real file.");
            	System.exit(1);
            	}
        	}
    	else {
    		System.out.println("You need to supply a file to read!");
    	}

    	//Grab my files now that the checks are done to make sure they are there.  
    	myFile = new File(firstArg);
		fileIn = new Scanner(myFile);
		
		System.out.println("");
		System.out.println("********** Welcome to the US Crime Statistical Application **************************");

		// get values from argument
    	while (fileIn.hasNextLine()){
    		String myline = fileIn.nextLine();
    		String[] brokenUpLine = myline.split(",");
            crimeStats.addYear(brokenUpLine);
    	}

        //Do while loop that will continusely prompt the user on a menu based system.
        do
        {
			System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : " );
			System.out.println("");
            System.out.println("1.)  What were the percentages in population growth for each consecutive year from 1994 – 2013? ");
            System.out.println("2.)  What year was the Murder rate the highest? ");
            System.out.println("3.)  What year was the Murder rate the lowest? ");
            System.out.println("4.)  What year was the Robbery rate the highest?");
            System.out.println("5.)  What year was the Robbery rate the lowest?");
			System.out.println("Q.)  Quit the program.");
			System.out.println("");
			System.out.println("Enter your selection: ");
            input = scan.nextLine();


            //Switch case to handle user input.
            switch(input){
            	case "1":
                    System.out.print("Please enter the first year, 1994-2013:  ");
                    String firstYear = scan.nextLine();
                    System.out.print("Please enter the second year, 1994-2013:  ");
                    String secondYear = scan.nextLine();
					crimeStats.populationGrowthChange(firstYear,secondYear);
					System.out.println("");
            		break;
            	case "2":
					crimeStats.maximumMurderRate();
					System.out.println("");
            		break;
            	case "3":
					crimeStats.minimumMurderRate();
					System.out.println("");
            		break;
            	case "4":
					crimeStats.maximumRobberyRate();
					System.out.println("");
            		break;
            	case "5":
					crimeStats.minimumRobberyRate();
					System.out.println("");
            		break;
            }

        }while(!input.equals("Q"));


		//Ending information
		System.out.println("");
        System.out.println("Thank you for trying the US Crimes Statistics Program.");
		long end = System.currentTimeMillis();
		System.out.println("");
        System.out.println("Elapsed time in seconds was: " + ((end - start) / 1000d) + " seconds");

        fileIn.close();
    }
}