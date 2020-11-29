
/**
* Created by Soichiro Ono on 11/29/2020.
* CMIS 141 - Homework3
* Purpose: This program constructs instances * of the HeadPhone class and test in IDE
*/

import java.awt.Color;

public class HeadPhone {
    // declare const type 
    static final int LOW = 1; 
    static final int MEDIUM = 2; 
    static final int HIGH = 3; 

    // declare data type 
    private int volume = MEDIUM; 
    private boolean pluggedIn = false; 
    private String manufacturer = "manufacturer"; 
    private Color headPhoneColor = Color.RED; 
    private String headPhoneModel = "apple"; 


    //make getter and setter method 
    // For volume method
    public int getVolume(){
        return volume;
    }
    public int setVolume(int value){
        return this.volume = value;
    }

    // for isPluggedIn method
    public boolean isPluggedIn(){
        return pluggedIn; 
    }
    public boolean setPluggedIn(){
        return this.pluggedIn = true;
    }

    
    // for Manufacturer method
    public String getManufacturer(){
        return manufacturer;
    }
    public String setManufacturer(String value){
        return this.manufacturer = value;
    }

    
    // for headphone model method
    public String getHeadPhoneModel(){
        return headPhoneModel;
    }
    public String setHeadPhoneModel(String value){
        return this.headPhoneModel = value;
    }

    
    
    // for HeadPhone color method
    public Color setHeadPhoneColor(Color color){
        return this.headPhoneColor = color;
    }
    public String getHeadPhoneColor(){
        String colorString = "";
        if (this.headPhoneColor == Color.RED){
            colorString = "Red";
            
        }else if (this.headPhoneColor == Color.BLACK){
            colorString = "Black";
            
        }else if (this.headPhoneColor == Color.BLUE){
            colorString = "Blue";
            
        }else if (this.headPhoneColor == Color.CYAN){
            colorString = "Cyan";
            
        }else if (this.headPhoneColor == Color.DARK_GRAY){
            colorString = "Dark Gray";
            
        }else if (this.headPhoneColor == Color.GRAY){
            colorString = "Gray";
            
        }else if (this.headPhoneColor == Color.GREEN){
            colorString = "Green";
            
        }else if (this.headPhoneColor == Color.LIGHT_GRAY){
            colorString = "Light Gray";
            
        }else if (this.headPhoneColor == Color.MAGENTA){
            colorString = "Magenta";
            
        }else if (this.headPhoneColor == Color.ORANGE){
            colorString = "Orange";
            
        }else if (this.headPhoneColor == Color.PINK){
            colorString = "Pink";
            
        }else if (this.headPhoneColor == Color.WHITE){
            colorString = "White";
            
        }else if (this.headPhoneColor == Color.YELLOW){
            colorString = "Yellow";
        }
        return colorString;
    }

    public String toString(){
        String infoString = 
            "(volume: " + this.volume + " pluggedIn: " + this.pluggedIn + " Manufacturer: " + this.manufacturer + " HeadPhone Color: "+ this.getHeadPhoneColor() + " HeadPhone Model: " + this.headPhoneModel +")";
        return infoString;
    }


    public int changeVolume(int value){
        int volumeValue = MEDIUM;

        if (this.volume == value){
            volumeValue = MEDIUM;
        }else if (this.volume < value){
            volumeValue = HIGH;
        }else if (this.volume > value){
            volumeValue = LOW;
        }
        
        return volumeValue;
    }
}
