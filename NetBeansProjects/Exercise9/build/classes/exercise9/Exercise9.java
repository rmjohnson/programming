package exercise9;

import java.util.Scanner;

/**
 * Class: Computer Science II
 * Assignment: Exercise 9.15
 * @author Ryan Johnson
 * Date of Last Modification: 2/17/2012
 * Description: This program reads in a string from the console and displays
 * how many uppercase letters are in that string.
 */
public class Exercise9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = args[0];
        int uppercaseCount = 0;
        /*Scanner cin = new Scanner(System.in);
        
        System.out.print("Please input a string: ");
        input = cin.nextLine();*/
        
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i)))
                uppercaseCount++;
        }
        
        System.out.println("The number of uppercase charcters in that string is " + uppercaseCount +".");
        
    }
}
