package exercise18;

import java.awt.HeadlessException;
import javax.swing.JApplet;

/**
 * Class: Computer Science II
 * Assignment: Exercise 18.21
 * @author Ryan Johnson
 * Date of Last Modification: 4/11/2012
 * Description: This program is a multiple window GUI that shows a bar graph
 * of the number of times each letter shows up in an inputted string.
 */
public class Exercise18 extends JApplet {
    
    /**
     * @param args the command line arguments
     */
    
    private static Clock clock;

    public Exercise18() throws HeadlessException {
        clock = new Clock();
        add(clock);
    }
    
    
    public static void main(String[] args) {
        
    }

    public static Clock getClock() {
        return clock;
    }
    
}
