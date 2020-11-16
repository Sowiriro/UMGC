
import java.awt.Color;

public class TestGuitar {
    public static void main(String[] args){
        //test case 1
        Guitar g1 = new Guitar();

        System.out.println("------------------- test case 1 ------------------------------");

        // to display all data of string
        String g1String = g1.toString();
        System.out.println("toString():"+ g1String);

        // To display Guitar Number
        int g1Num = g1.getNumString();
        System.out.println("getNumStrings():" + g1Num);

        // To display Guitar Manufacturer
        String g1Manufacturer = g1.getManufacturers(); 
        System.out.println("getManufacturer():"+ g1Manufacturer);

        // To display guitar length
        double g1Length = g1.getLength(); 
        System.out.println("getLength():"+ g1Length);

        // To display guitar color 
        String g1Color = g1.getGuitarColor(); 
        System.out.println("getGuitarColor():"+ g1Color);

        // To display and play the guitar 
        String g1PlayGuitar = g1.playGuitar();
        System.out.println("getPlayGuitar():"+ g1PlayGuitar);


        Guitar g2 = new Guitar(3, "Soichiro", 29.0, Color.CYAN);
        System.out.println("----------------- test case 2 ------------------------------");

        // to display all data of string
        String g2String = g2.toString();
        System.out.println("toString():"+ g2String);

        // To display Guitar Number
        int g2Num = g2.getNumString();
        System.out.println("getNumStrings():" + g2Num);

        // To display Guitar Manufacturer
        String g2Manufacturer = g2.getManufacturers(); 
        System.out.println("getManufacturer():"+ g2Manufacturer);

        // To display guitar length
        double g2Length = g2.getLength(); 
        System.out.println("getLength():"+ g2Length);

        // To display guitar color 
        String g2Color = g2.getGuitarColor(); 
        System.out.println("getGuitarColor():"+ g2Color);

        // To display and play the guitar 
        String g2PlayGuitar = g2.playGuitar();
        System.out.println("getPlayGuitar():"+ g2PlayGuitar);


        Guitar g3 = new Guitar(2, "Lyam", 30.0, Color.BLACK);
        System.out.println("---------------------- test case 3 -------------------");

        // to display all data of string
        String g3String = g3.toString();
        System.out.println("toString():"+ g3String);

        // To display Guitar Number
        int g3Num = g3.getNumString();
        System.out.println("getNumStrings():" + g3Num);

        // To display Guitar Manufacturer
        String g3Manufacturer = g3.getManufacturers(); 
        System.out.println("getManufacturer():"+ g3Manufacturer);

        // To display guitar length
        double g3Length = g3.getLength(); 
        System.out.println("getLength():"+ g3Length);

        // To display guitar color 
        String g3Color = g3.getGuitarColor(); 
        System.out.println("getGuitarColor():"+ g3Color);

        // To display and play the guitar 
        String g3PlayGuitar = g3.playGuitar();
        System.out.println("getPlayGuitar():"+ g3PlayGuitar);
        
    }

}
