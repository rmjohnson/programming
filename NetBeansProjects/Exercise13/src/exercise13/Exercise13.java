package exercise13;

/**
 *
 * Class: Computer Science II
 * Assignment: Exercise 13.10
 * @author Ryan Johnson
 * Date of Last Modification: 3/8/2012
 * Description: This program purposefully runs out of memory by creating
 * a huge array and then catches the OutOfMemoryError exception.
 */
public class Exercise13 {

    /**
     * @param args the command line arguments
     */                                                                                                                                                                                                                                                                               
    public static void main(String[] args) {
        try {
            int[][][][][] bigArray = new int[999][999][999][999][999];
        } catch(OutOfMemoryError e) {
            System.out.println("Out of memory!");
        }
    }
    
}
