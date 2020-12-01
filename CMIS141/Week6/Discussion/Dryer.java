public class Dryer {

    // declaare daata type and default value
    private boolean dryerSwitch = false; 
    private String manufacturer = "Sony"; 

    // getter and setter method for switch
    public boolean getSwitch(){
        return dryerSwitch;
    }
    public boolean setSwitch(){
        return this.dryerSwitch = true; 
    }


    // getter and setter method for manufacture
    public String getManufacturer(){
        return manufacturer; 
    }
    public String setManufacturer(String value){
        return this.manufacturer = value;
    }


    // declare all data to string value
    public String toString(){
        String infoString = 
        "(DryerSwitch is " + this.dryerSwitch + " Manufacturer is " + this.manufacturer +")";
        return infoString;
    }

}
