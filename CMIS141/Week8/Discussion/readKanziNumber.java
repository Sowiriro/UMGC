
/*
* File: readKanziNumber.java
* Author: Soichiro Ono
* Date: 12/15/2020
* Purpose: Read and Print list of Strings
* Class: UMUC 141 Professor Angelo Luo
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class readKanziNumber{
    public static void main(String[] args) throws Exception{
        // select  file 
        File file = new File("Kanzi.txt");
        // initialized buffered reader object
        BufferedReader br = null;
        try {
            // prepare buffered reader object and read from file variable
            br = new BufferedReader(new FileReader(file));
            // declare text
            String text;
            // initialized count as int
            int count = 0;
            // make loop until text finished to read
            while ((text = br.readLine()) != null) {
                // make count
                count++;
                // See data and put some number
                System.out.println( count + " is: " +text);
            }
            // count how many numbers are there
            System.out.println(count + " data values were read");
            } finally {
            if (br != null) {
                // if it's done, buffered reader object close.
                br.close();
            }
        }
    }
}