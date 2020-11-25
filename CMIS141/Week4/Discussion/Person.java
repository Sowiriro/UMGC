
public class Person {
    // declare data type
    private int age;
    private String name; 

    // default constructor
    public Person(){
        age = 22; 
        name = "Soichiro";
    }

    // constructor that is editable
    public Person( int age, String name){
        this.age = age; 
        this.name = name; 
    }

    //  get method-------------------------
    // get person's age
    public int getAge(){
        return age; 
    }

    //  get person's name
    public String getName(){
        return name; 
    }

}

