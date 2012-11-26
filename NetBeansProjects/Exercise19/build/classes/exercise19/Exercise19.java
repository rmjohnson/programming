package exercise19;

import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class: Computer Science II
 * Assignment: Exercise 19.8
 * @author Ryan Johnson
 * Date of Last Modification: 4/16/2012
 * Description: This program reads in a count from a file (Exercise19_8.dat)
 * that stores a count of how many times the program has been run. It then
 * increments this count and writes the new number to the file.
 */
public class Exercise19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            RandomAccessFile countFile = new RandomAccessFile("Exercise19_8.dat", "rw"); //get the file
            int count; //declare the count
            if(countFile.length() == 0) {
                count = 0;
            } else {
                count = countFile.read(); //read in the count
            }
            count++; //increment the count
            System.out.println(count); //display the count
            countFile.seek(0); //reset the file to the beginning
            countFile.write(count); //write the new count
            countFile.close(); //close the file
        } catch (Exception ex) { //catch exceptions
            Logger.getLogger(Exercise19.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
