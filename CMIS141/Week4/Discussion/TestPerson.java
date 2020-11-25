
public class TestPerson {
    public static void main(String[] args){

        // create person object
        // me 
        Person p1 = new Person();
        // my brother
        Person p2 = new Person(20, "Shinnosuke");
        // my sister
        Person p3 = new Person(18, "Airi");

        // print p1, p2 and p3 and get age and name by get method;
        System.out.println("My name is" + p1.getName() +"."+ "And my age is "+ p1.getAge() );
        System.out.println("My name is" + p2.getName() +"."+ "And my age is "+ p2.getAge() );
        System.out.println("My name is" + p3.getName() +"."+ "And my age is "+ p3.getAge() );
    }
}
