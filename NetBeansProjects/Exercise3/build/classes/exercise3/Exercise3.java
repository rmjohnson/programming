package exercise3;

import java.util.Scanner;

/**
 * Class: Computer Science II
 * Assignment: Exercise 3.15
 * @author Ryan Johnson
 * Date of Last Modification: 1/20/2012
 * Description: The program takes in a year, month, and day of the month and uses
 * Zeller's congruence to calculate the day of the week that the day was on.
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // Generate a random number (3 digits)
        int pick3value = (int)(Math.random()*1000);
        boolean digits_match = false;
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
        // All 3 digits match
        if(pick3value == guess) {
            System.out.println("You won! $10,000");
        // All 3 digits are there but don't match exactly
        } else if(g_d1 == p3_d1) {
            if(g_d2 == p3_d3) 
                if(g_d3 == p3_d2) 
                    digits_match = true;
        } else if(g_d1 == p3_d2) {
            if(g_d2 == p3_d1) {
                if(g_d3 == p3_d3)
                    digits_match = true;
            } else if(g_d2 == p3_d3) {
                if(g_d3 == p3_d1)
                    digits_match = true;
            }
        } else if(g_d1 == p3_d3) {
            if(g_d2 == p3_d2) {
                if(g_d3 == p3_d1)
                    digits_match = true;
            } else if(g_d2 == p3_d1) {
                if(g_d3 == p3_d2)
                    digits_match = true;
            }
        // Check if one of the digits matches exactly
        } else if((g_d1 == p3_d1 || g_d1 == p3_d2 || g_d1 == p3_d3) ||
                  (g_d2 == p3_d1 || g_d2 == p3_d2 || g_d2 == p3_d3) ||
                  (g_d3 == p3_d1 || g_d3 == p3_d2 || g_d3 == p3_d3)) {
            System.out.println("One of the digits matched, you win $1,000.");
        } else {
            System.out.println("Sorry. The Pick3 was " + pick3value + " Please try again.");
        }
        
        if(digits_match)
            System.out.println("All digits are covered. You win $3,000.");
        */
        int h, q, m, j, k, year;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2008): ");
        year = cin.nextInt();
        
        System.out.print("Enter month: 1-12: ");
        m = cin.nextInt();
        if(m == 1)
        {
            m = 13;
            year--; 
        }
        if(m == 2)
        {
            m = 14;
            year--;
        }
        System.out.print("Enter the day of the month: 1-31: ");
        q = cin.nextInt();
        j = (int)(year/100);
        k = year % 100;
        h = (q + (26*(m + 1)/10) + k + (k/4) + (j/4) + 5*j) % 7;
        switch(h) {
            case 0:
                System.out.println("Day of the week is Saturday.");
                break;
            case 1:
                System.out.println("Day of the week is Sunday.");
                break;
            case 2:
                System.out.println("Day of the week is Monday.");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday.");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday.");
                break;
            case 5:
                System.out.println("Day of the week is Thursday.");
                break;
            case 6:
                System.out.println("Day of the week is Friday.");
                break;
        }
        
    }
}
