package rmjassign1;

import java.util.Scanner;

/**
 * Class: Data Structures
 * Assignment: Assignment #1
 * @author Ryan Johnson
 * Date of Last Modification: 9/5/2012
 * Description: This program uses LZW compression and decoding to take a string
 * and compress it. It then takes a compressed string and decodes it.
 */
public class RmjAssign1 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); //Scaner for input
        String[] enTable = new String[10000]; //Encode table
        int enTableSize = -1; //A variable to track where the last element in the encode table
        String[] tempTable; //Temporary table to read in encode table
        String[] tempDecodeInput; //Temporary string array to read in decode input with spaces
        String input; //Input string to be compressed
        String decodeInput = ""; //Input string to be decoded
        LZW lzw = new LZW(); //A lzw object to call the methods for compresion and decoding
        //Read in the encode table and take out the spaces
        tempTable = cin.nextLine().split(" ");
        for (int i = 0; i < tempTable.length; i++) {
            enTable[i] = tempTable[i];
            enTableSize++;
        }
        input = cin.nextLine(); //Read in the string to be compressed
        tempDecodeInput = cin.nextLine().split(" "); //Read in string to be decoded, taking out the spaces
        for (int i = 0; i < tempDecodeInput.length; i++) {
            decodeInput = decodeInput.concat(tempDecodeInput[i]);
        }
        
        //Output and labels
        System.out.println("Input Text");
        System.out.println(input);
        System.out.println("Encoded");
        System.out.println(lzw.Compress(input, enTable,enTableSize)); //Compression method
        System.out.println("Input Code");
        for (int i = 0; i < tempDecodeInput.length; i++) {
            System.out.print(tempDecodeInput[i]+" ");
        }
        System.out.println("");
        System.out.println("Decoded Text");
        System.out.println(lzw.Decode(decodeInput, enTable,enTableSize)); //Decoding method
    }
    
}
