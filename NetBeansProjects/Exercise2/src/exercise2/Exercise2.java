package exercise2;

import java.util.Scanner;

/**
 * Class: Computer Science II
 * Assignment: Exercise 2.7
 * @author Ryan Johnson
 * Date of Last Modification: 1/18/2012
 * Description: This program takes a number of minutes as input, and then 
 * outputs how many years and days that approximately is. It uses integer division
 * to calculate the years, and then the modulus operator is used to calculate 
 * how many days are left over.
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minutes, days, years;
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        minutes = cin.nextInt();
        // (60 * 24 * 365) to calculate the number of minutes in a year.
        // 60 minutes * 24 hours * 365 days
        years = minutes / (60 * 24 * 365);
        //Get the left over number of minutes and then convert that to days
        days = (minutes % (60 * 24 * 365)) / (24 * 60);
        System.out.printf("%d minutes is approximately %d years and %d days.\n",minutes,years,days);
    }
}
