/**
 * Created by Soichiro Ono on 11/15/2021.
 * CMIS 141 - Homework2
 * Purpose: This program constructs instances * of the Point class and uses
 * its methods
 */

import  java.util.Random;
import java.awt.Color;

public class Guitar {
    // declare the type of data 
    private int numString;
    private String manufacturers;
    private double length;
    private Color guitarColor;


    //default constructor 
    public Guitar (){
        numString = 6; //
        manufacturers = "Gibson"; 
        length = 28.2; 
        guitarColor = Color.RED; 
    }

    // Constructor 
    public Guitar(int num, String person, double inches, Color color){
        numString = num; //
        manufacturers = person; 
        length = inches; 
        guitarColor = color; 
    }


    //getter methods
    // get NumString
    public int getNumString(){
        return numString;
    }

    // get guitar manufacturers
    public String getManufacturers(){
        return manufacturers;
    }

    // get guitar length
    public double getLength(){
        return length;
    }

    // get guitar color 
    public String getGuitarColor(){
        String colorString = "";
        if (this.guitarColor == Color.RED){
            colorString = "Red";
            
        }else if (this.guitarColor == Color.BLACK){
            colorString = "Black";
            
        }else if (this.guitarColor == Color.BLUE){
            colorString = "Blue";
            
        }else if (this.guitarColor == Color.CYAN){
            colorString = "Cyan";
            
        }else if (this.guitarColor == Color.DARK_GRAY){
            colorString = "Dark Gray";
            
        }else if (this.guitarColor == Color.GRAY){
            colorString = "Gray";
            
        }else if (this.guitarColor == Color.GREEN){
            colorString = "Green";
            
        }else if (this.guitarColor == Color.LIGHT_GRAY){
            colorString = "Light Gray";
            
        }else if (this.guitarColor == Color.MAGENTA){
            colorString = "Magenta";
            
        }else if (this.guitarColor == Color.ORANGE){
            colorString = "Orange";
            
        }else if (this.guitarColor == Color.PINK){
            colorString = "Pink";
            
        }else if (this.guitarColor == Color.WHITE){
            colorString = "White";
            
        }else if (this.guitarColor == Color.YELLOW){
            colorString = "Yellow";
        }
        return colorString;
    }


    //"Play" 16 random notes (return a string with them"
    public String playGuitar(){
        String play = "[";
        //arrays containing possible notes and duration
        char[] notes = {'A','B','C','D','E','F','G'};
        double[] duration = {0.25,0.5,1,2,4};
        //integers works as index for the arrays above
        int a;
        int b;
        //initiate a random number
        Random rn = new Random();
        //for loop to select 16 random notes
        for (int k=0;k<16;k++){a = rn.nextInt(7);
            b = rn.nextInt(5);
            play = play + notes[a] + "(" + String.valueOf(duration[b]) + ")";
            if (k!=15) play = play + ",";
        }
        play = play + ']';
        return play;
    }

    // convert all data to string
    public String toString(){
        String infoString = 
            "(numStrings="+this.numString+", Length="+this.length+",manufacturer="+this.manufacturers+", color="+this.getGuitarColor()+")";
        return infoString;
    }
}