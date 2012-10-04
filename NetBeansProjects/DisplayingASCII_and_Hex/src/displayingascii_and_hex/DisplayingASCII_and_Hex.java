/*
 * Display the ASCII and Hexidecimal value of
 * a character entered by the uesr.
 */
package displayingascii_and_hex;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class DisplayingASCII_and_Hex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch= cin.next().charAt(0);
        while(ch != '|'){
            System.out.printf("Character %c ASCII: %d Hex: %x\n",ch,(int)ch,(int)ch);
            System.out.print("Enter a character ['|' to exit]: ");
            ch = cin.next().charAt(0);
        }
        System.out.println("Program terminated successfully.");
    }
}
