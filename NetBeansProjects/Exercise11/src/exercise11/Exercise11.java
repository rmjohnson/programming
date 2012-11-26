package exercise11;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;

/**
 * Class: Computer Science II
 * Assignment: Exercise 11.6
 * @author Ryan Johnson
 * Date of Last Modification: 2/26/2012
 * Description: This program creates an array list and adds a date object,
 * a jframe object, a circle object, and a loan object to the ArrayList. Then
 * the ArrayList is looped through and the objects toString() methods are called
 * and printed out to the screen.
 */
public class Exercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Date day = new Date();
        JFrame jf = new JFrame();
        Circle c1 = new Circle();
        Loan myLoan = new Loan();
        String hi = "This is a string!";
        al.add(day);
        al.add(jf);
        al.add(c1);
        al.add(myLoan);
        al.add(hi);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
