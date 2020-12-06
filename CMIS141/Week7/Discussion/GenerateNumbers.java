import java.util.Random;
public class GenerateNumbers {
    public static void main(String[] args) {
        // X is  going  to be  args[0] and y  is  going  to  be args[1] 
        int X=Integer.parseInt(args[0]);
        int Y=Integer.parseInt(args[1]);


        // Create an instance of Random
        Random random = new Random();
        System.out.println("Choose your favorite number: ");

        

        System.out.println(X+" Random numbers between 0 and "+Y+" are:");
        // For loop from 0 to X
        for(int i=0;i<X;i++){
            System.out.println(random.nextInt(Y));
        }
    }
    public String hitNumber(){
        
    }
}