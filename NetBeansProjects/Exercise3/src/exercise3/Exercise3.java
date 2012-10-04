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
