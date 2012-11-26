/*
 * This program guesses a value the player is 
 * thinking of between 1-1,000,000.
 */
package guess_the_number;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Guess_The_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guess = 500000, guessCount=1;
        char response; // 'C' 'H' 'L'
        Scanner cin = new Scanner(System.in);
        int maxRange = 1000000, minRange = 0;
        // 1. Ask the user to think of a number between 1-1,000,000.
        System.out.println("Think of a number in the range [1-1,000,000].");
        // 2. Guess the value halfway in the unknown range
        System.out.print(guessCount + ": Is the number " + guess + "? [C - correct/H - too high/L - too low]: ");
        response = cin.next().toUpperCase().charAt(0);
        while(response != 'C') {
            if(response == 'H') {
                maxRange = guess;
            } else if(response == 'L') {
                minRange = guess;
            }
            guess = (maxRange + minRange) / 2;
            System.out.print((++guessCount) + ": Is the number " + guess + 
                    "? [C - correct/H - too high/L - too low]: ");
            response = cin.next().toUpperCase().charAt(0);
            if(guessCount > 20)
            {
                System.out.println("Cheater!");
            }
        }
        System.out.println("I guessed your number in " + guessCount + " tries.");
    }
}