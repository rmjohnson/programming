/*
 * Guess the index of the hdiden true value
 */
package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ryan Johnson
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] island = new boolean[10];
        island[(int)(Math.random()*10)] = true;
        Scanner cin = new Scanner(System.in);
        int input;
        int guessCount = 0;
        while(true) {
            try {
                System.out.print("Find the treasure! (0-9): ");
                input = cin.nextInt();
                guessCount++;
                if(island[input]) {
                    System.out.println("You found the treasure in " + guessCount + " guesses!");
                    break;
                }
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter a value in the range 0-9.");
                guessCount--;
            }
            catch(InputMismatchException e) {
                System.out.println("Input must be a number in the range 0-9.");
                cin.nextLine();
            }
            catch(Exception e) {
                System.out.println("Exception: " + e.getMessage());
                throw(e);
            }
        }       
    }
}
