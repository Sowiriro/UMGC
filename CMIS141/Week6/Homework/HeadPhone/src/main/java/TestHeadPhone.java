
/**
* Created by Soichiro Ono on 11/29/2020.
* CMIS 141 - Homework3
* Purpose: This program constructs instances * of the HeadPhone class and test in IDE
*/

import java.awt.Color;


public class TestHeadPhone {
    public static void main(String[] args) {
        //test case 1
        HeadPhone h1 = new HeadPhone();

        System.out.println("------------------- test case 1 ------------------------------");

        // to display all data of string
        String h1String = h1.toString();
        System.out.println("toString():"+ h1String);

        // To display Headphone Volume
        h1.setVolume(1);
        int h1Volume = h1.getVolume();
        System.out.println("getVolume():" + h1Volume);

        // To display Guitar Manufacturer
        h1.setManufacturer("Soichiro");
        String h1Manufacturer = h1.getManufacturer(); 
        System.out.println("getManufacturer():"+ h1Manufacturer);

        // To display is headphone plugged in?
        h1.setPluggedIn();
        boolean h1PluggedIn = h1.isPluggedIn(); 
        System.out.println("isPluggedIn():"+ h1PluggedIn);

        // To display headPhone color 
        h1.setHeadPhoneColor(Color.yellow);
        String h1Color = h1.getHeadPhoneColor(); 
        System.out.println("getHeadPhoneColor():"+ h1Color);
        
        // To displaay headPhone model 
        h1.setHeadPhoneModel("Sumsung");
        String h1model = h1.getHeadPhoneModel(); 
        System.out.println("getHeadPhoneModel(): "+ h1.getHeadPhoneModel());

        // To display and play the guitar 
        h1.setVolume(3);
        int h1changeVolume = h1.changeVolume(1);
        System.out.println("changeVolume():"+ h1changeVolume);
        
        
        //test case 2
        HeadPhone h2 = new HeadPhone();

        System.out.println("------------------- test case 2 ------------------------------");

        // to display all data of string
        String h2String = h2.toString();
        System.out.println("toString():"+ h2String);

        // To display Headphone Volume
        h2.setVolume(1);
        int h2Volume = h2.getVolume();
        System.out.println("getVolume():" + h2Volume);

        // To display Guitar Manufacturer
        h2.setManufacturer("Adam");
        String h2Manufacturer = h2.getManufacturer(); 
        System.out.println("getManufacturer():"+ h2Manufacturer);

        // To display is headphone plugged in?
        h2.setPluggedIn();
        boolean h2PluggedIn = h2.isPluggedIn(); 
        System.out.println("isPluggedIn():"+ h2PluggedIn);

        // To display headPhone color 
        h2.setHeadPhoneColor(Color.CYAN);
        String h2Color = h2.getHeadPhoneColor(); 
        System.out.println("getHeadPhoneColor():"+ h2Color);
        
        // To displaay headPhone model 
        h2.setHeadPhoneModel("LG");
        String h2model = h2.getHeadPhoneModel(); 
        System.out.println("getHeadPhoneModel(): "+ h2model);

        // To display and play the guitar 
        h2.setVolume(1);
        int h2changeVolume = h2.changeVolume(3);
        System.out.println("changeVolume():"+ h2changeVolume);
        
        
        
        
        
        //test case 3
        HeadPhone h3 = new HeadPhone();

        System.out.println("------------------- test case 3 ------------------------------");

        // to display all data of string
        String h3String = h3.toString();
        System.out.println("toString():"+ h3String);

        // To display Headphone Volume
        h3.setVolume(3);
        int h3Volume = h3.getVolume();
        System.out.println("getVolume():" + h3Volume);

        // To display Guitar Manufacturer
        h3.setManufacturer("Liam");
        String h3Manufacturer = h3.getManufacturer(); 
        System.out.println("getManufacturer():"+ h3Manufacturer);

        // To display is headphone plugged in?
        h3.setPluggedIn();
        boolean h3PluggedIn = h3.isPluggedIn(); 
        System.out.println("isPluggedIn():"+ h3PluggedIn);

        // To display headPhone color 
        h3.setHeadPhoneColor(Color.gray);
        String h3Color = h3.getHeadPhoneColor(); 
        System.out.println("getHeadPhoneColor():"+ h3Color);
        
        // To displaay headPhone model 
        h3.setHeadPhoneModel("Docomo");
        String h3model = h3.getHeadPhoneModel(); 
        System.out.println("getHeadPhoneModel(): "+ h3model);

        // To display and play the guitar 
        int h3changeVolume = h3.changeVolume(1);
        System.out.println("changeVolume():"+ h3changeVolume);
    }
}
