/*
 * Pick 3 lottery simulator 
 */
package lottery;

import java.util.Scanner;

/**
 *
 * @author Ryan Johnson
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generate a random number (3 digits)
        int pick3value = (int)(Math.random()*1000);
        // get the guess from the user
        System.out.print("Enter your lottery ticket [3 digit]: ");
        Scanner cin = new Scanner(System.in);
        int guess = cin.nextInt();
        int p3_d1 = pick3value / 100;
        int p3_d2 = (pick3value % 100) /10;
        int p3_d3 = pick3value % 10;
        int g_d1 = guess / 100;
        int g_d2 = (guess % 100) / 10;
        int g_d3 = guess % 10;
        // report the result 
        if(pick3value == guess) {
            System.out.println("You won! $200");
        } else if((g_d1 == p3_d1 || g_d1 == p3_d2 || g_d1 == p3_d3) &&
                  (g_d2 == p3_d1 || g_d2 == p3_d2 || g_d2 == p3_d3) &&
                  (g_d3 == p3_d1 || g_d3 == p3_d2 || g_d3 == p3_d3)) {
            System.out.println("All digits are covered. $1");
        } else {
            System.out.println("Sorry. The Pick3 was " + pick3value + " Play again");
        }
    }
}
