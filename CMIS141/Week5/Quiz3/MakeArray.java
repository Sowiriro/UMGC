// File: MakeArray.java from week5 discussion
// Author: Soichiro Ono
// Date: 24 November 2020
// Purpose: This program store array of my family member and executes. 

public class MakeArray {
    public static void main(String[] args) {
        System.out.println("Start make array");

        String[] familyArray = new String[5];
        familyArray[0] = "Kousei"; 
        familyArray[1] = "Naomi"; 
        familyArray[2] = "Soichiro"; 
        familyArray[3] = "Shinnosuke"; 
        familyArray[4] = "Airi"; 
        
        System.out.println("My father is " + familyArray[0]); 
        System.out.println("My mother is " + familyArray[1]); 
        System.out.println("I am " + familyArray[2]); 
        System.out.println("My young brother is " + familyArray[3]); 
        System.out.println("My young sister is " + familyArray[4]); 

        System.out.println("Family member is  "+ familyArray.length);
    }
}
