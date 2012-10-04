package exercise8;

import java.util.Scanner;

/**
 *Class: Computer Science II
 * Assignment: Exercise 8.10
 * @author Ryan Johnson
 * Date of Last Modification: 2/15/2012
 * Description: This program creates an object of the QuadraticEquation class
 * with parameters a,b, and c. It then returns the roots from the QuadraticEquation
 * class.
 */
public class Exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter a, b, c:");
        a = cin.nextDouble();
        b = cin.nextDouble();
        c = cin.nextDouble();
        
        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant: " + quad.getDiscriminant());
        if(quad.getDiscriminant() > 0) {
            System.out.printf("The results are %f and %f\n",quad.getRoot1(), quad.getRoot2());
        } else if(quad.getDiscriminant() == 0) {
            System.out.printf("The root is %f\n", quad.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
        
    }
}
