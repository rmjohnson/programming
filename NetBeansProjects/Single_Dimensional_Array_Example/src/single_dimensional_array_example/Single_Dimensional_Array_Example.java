/*
 * Example of working iwth a single dimensional array.
 * Loading the array with random values (1-1000000)
 * Display the array
 * Sorting the array
 * Displaying the sorted array
 */
package single_dimensional_array_example;

import java.util.Arrays;

/**
 *
 * @author Ryan
 */
public class Single_Dimensional_Array_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] iArray = new int[10];
        // load the array with random values
        load_Random_Values(iArray);
        // display the array
        display_Array(iArray);
        Arrays.sort(iArray);
        display_Array(iArray);
    }
    
    public static void load_Random_Values(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*1000000+1);
        }
    }
    
    public static void display_Array(final int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
