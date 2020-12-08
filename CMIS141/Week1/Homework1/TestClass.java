// Week 4 Discussion
// Author: Tanner Hedrick
// Date: 2020/11/13
// creates a dog object and gets the dog's color and breed.

//imports our dogs class
import Dogs.Dog;

//tests our dog class
public class TestClass {

    public static void main(String[] args) {
	//creates our dog objects
        Dog myDog = new Dog("Black Lab", "Black");
        Dog friendsDog = new Dog("Golden-Doodle");
        Dog neighborsDog = new Dog();
	
	//prints out our dog objects with getters
        System.out.println("My dog is a " + myDog.getBreed() + " and color is " + myDog.getColor());
        System.out.println("My friend's dog is a " + friendsDog.getBreed() + " and color is " + friendsDog.getColor());
        System.out.println("My neighbor's dog is a " + neighborsDog.getBreed() + " and color is " + neighborsDog.getColor());
    }
}
