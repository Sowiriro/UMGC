public class TestDryer {
    public static void main(String[] args){

        Dryer d1 = new Dryer(); 

        System.out.println("Default Dryer is " + d1.toString());

        d1.setManufacturer("Sanyo");
        System.out.println("Dryer is made by " + d1.getManufacturer());

        d1.setSwitch();
        System.out.println("Switch on "+ d1.getSwitch());

    }
}
