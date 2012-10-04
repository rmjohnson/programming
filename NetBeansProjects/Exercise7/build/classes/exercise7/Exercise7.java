package exercise7;

import java.util.Scanner;

/**
 * Class: Computer Science II
 * Assignment: Exercise 7.11
 * @author Ryan Johnson
 * Date of Last Modification: 2/8/2012
 * Description: This program gets a number that is then converted a 3x3 binary array.
 * The number is then displayed as Hs (0s) and Ts (1s) for heads and tails. It is displayed
 * in a 3x3 grid.
 */
public class Exercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int[][] numArray;
        Scanner cin = new Scanner(System.in);
        // Get Input
        System.out.print("Enter a number between 0 and 511: ");
        num = cin.nextInt();    
        // Convert to binary array
        numArray = binaryArray(num);
        // Print out array with H and T
        displayBinaryArray(numArray);
    }
    /**
     * Converts a number to a special 3x3 binary multidimensional array.
     * @param num
     * @return 
     */
    static int[][] binaryArray(int num) {
        int[][] array = new int[3][3];
        int[][] binaryArray = {{256,128,64},
                               {32,16,8},
                               {4,2,1}};
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray[i].length; j++) {
                if(num - binaryArray[i][j] >= 0) {
                    array[i][j] = 1;
                    num -= binaryArray[i][j];
                }
            }     
        }
        return array;
    }
    
    /**
     * Takes in an array with 1s and 0s and prints them out as Hs and Ts.
     * @param numArray 
     */
    static void displayBinaryArray(int[][] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                if(numArray[i][j] == 0)
                    System.out.print("H ");
                else
                    System.out.print("T ");
            }
            System.out.println("");
        }
    }
}
