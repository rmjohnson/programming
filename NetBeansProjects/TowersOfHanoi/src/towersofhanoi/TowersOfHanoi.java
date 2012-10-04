/*
 * Program to give monks instructions on how
 * to solve the towers of hanoi problem.
 */
package towersofhanoi;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class TowersOfHanoi {
    
    static int moveCount = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the number of golden disks: ");
        int disks = cin.nextInt();
        System.out.println("Instructinos for moving the disks.");
        toh(disks,"A","B","C");
        System.out.println("Work harder, better, faster, stronger, cheaper...");
    }

    public static void toh(int n, String from, String to, String use) {
        if (n == 1) {
            System.out.println(++moveCount+": Move from " + from + " to " + to + ".");
        } else {
            toh(n - 1, from, use, to);
            System.out.println(++moveCount+": Move from " + from + " to " + to + ".");
            toh(n - 1, use, to, from);
        }
    }
}
