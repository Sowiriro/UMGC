//Olivia Delgado
//CMIS 141
//program that generates random numbers that are less than 16 and inputs assigns them to the array that are different  attributes
import java.util.Random;

public class AttributePoints
{
    static final int attributeSize = 7;
    
	public static void main(String[] args) {
	    System.out.println("Welcome to your Character sheet!");
	    //creats a random element with an upperbound of 16
	    Random rand = new Random();
	    int upperbound = 16;
	    //creates an array of attributes
	    String[] attributeArray = new String[attributeSize];
	    attributeArray[0] = "Health Points: ";
	    attributeArray[1] = "Strength: ";
	    attributeArray[2] = "Dexterity: ";
	    attributeArray[3] = "Constitution: ";
	    attributeArray[4] = "Intelligence: ";
	    attributeArray[5] = "Wisdom: ";
	    attributeArray[6] = "Charisma: ";

	    //creates an array of ints based on the length of the attributeArray
	    int[] pointArray = new int[attributeArray.length];

	    //for loop to assign the random ints to the attributes
	    for (int i = 0; i < attributeArray.length; i++) {
	        pointArray[i] = rand.nextInt(upperbound);
	        System.out.println(attributeArray[i] + pointArray[i]);

	    }
		
	}
}
