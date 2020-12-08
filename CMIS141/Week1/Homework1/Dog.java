// Week 4 Discussion
// Author: Tanner Hedrick
// Date: 2020/11/13
// Is a Dog class with 2 feilds, 2 methods, and three constructors.

//creates a package so that our test class can use this Class
package Dogs;

public class Dog {

    //creats fields for dog breed and color
    private String breed;
    private String color;

    //default values for if they do not initialy set dog values
    public Dog(){
        this("Black Lab", "Rainbow");
    }
    //default values for dog color if they pick a breed
    public Dog(String breed){
        this(breed, "Rainbow");
    }
    //constructor input of breed and color
    public Dog(String breed, String color){
        this.breed = breed;
        this.color = color;
    }

    //returns the dogs breed
    public String getBreed(){
        return this.breed;
    }
    //returns the dogs color
    public String getColor(){
        return this.color;
    }

}

