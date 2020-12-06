import  java.util.Random;

public class CommandLine {
    public static void main(String[] args){
        // get first arg[0] and second arg[1]
        int  x  = Integer.parseInt(args[0]);
        int  y  = Integer.parseInt(args[1]);

        // and print what user type in a command line
        System.out.println("Your first args is: " + x );
        System.out.println("Your second args is: " + y );


        // made  instance of random for random numbers
        Random rand = new Random();

        System.out.println("I will make random numbers: "+ x + " times " +  " between 0 to: " + y);

        // intimate x times between 0 to y 
        for (int i = 0; i < x;  i++){
            System.out.println(rand.nextInt(x));
        }
    }
}
