package threemusketeers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class ThreeMusketeers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {//Try to read in the file, otherwise throw a FileNotFoundException
            in = new Scanner(new File("ThreeMusketeers.txt")); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ThreeMusketeers.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Create a string array that is bigger than the number of lines of the input file
        String[] lines = new String[32000]; 

        int index = 0; //The current index of the reading in file
        //A long to record the current time in milliseconds before the sort is run
        long start;
        //A long to record the current time in milliseconds after the sort is run
        long end;
        String tmpStr; //A temporary string used for reading in the file

        //Input
        while (in.hasNext()) { //While there are still lines
            tmpStr = in.nextLine().trim(); //Read in the line and trim it
            if (!tmpStr.isEmpty()) { //If the line isn't empty
                lines[index++] = tmpStr; //Add it the index array and increment the index
            }
        }

        //Bubble sort
        String[] bubble = new String[index]; //Initialize the bubble array to the size of the input array
        System.arraycopy(lines, 0, bubble, 0, index); //Copy the input array to the bubble array
        start = System.currentTimeMillis(); //Get the start time (before the sort)
        bubbleSort(bubble); //Run the bubble sort function
        end = System.currentTimeMillis(); //Get the end time (after the sort)
        System.out.println("Bubble sort time: " + (end - start)); //Output the end minus the start time

        //Selection sort
        String[] select = new String[index]; //Initialize the select array to the size of the input array
        System.arraycopy(lines, 0, select, 0, index); //Copy the input array to the select array
        start = System.currentTimeMillis(); //Get the start time (before the sort)
        selectionSort(select); //Run the selection sort function
        end = System.currentTimeMillis(); //Get the end time (after the sort)
        System.out.println("Selection sort time: " + (end - start)); //Output the end minus the start time

        //Insertion sort
        String[] insert = new String[index]; //Initialize the insert array to the size of the input array
        System.arraycopy(lines, 0, insert, 0, index); //Copy the input array to the insert array
        start = System.currentTimeMillis(); //Get the start time (before the sort)
        insertionSort(insert); //Run the insertion sort function
        end = System.currentTimeMillis(); //Get the end time (after the sort)
        System.out.println("Insertion sort time: " + (end - start)); //Output the end minus the start time

        //Merge sort
        String[] merge = new String[index]; //Initialize the insert array to the size of the input array
        System.arraycopy(lines, 0, merge, 0, index); //Copy the input array to the merge array
        start = System.currentTimeMillis(); //Get the start time (before the sort)
        mergeSort(merge); //Run the merge sort function
        end = System.currentTimeMillis(); //Get the end time (after the sort)
        System.out.println("Merge sort time: " + (end - start)); //Output the end minus the start time
    }

    public static void bubbleSort(String[] bubble) {
        String tmpStr = ""; //A temporary string used for swapping strings
        //Loop through the array starting at 1
        for (int i = 1; i < bubble.length - 1; i++) { 
            //Loop through the array starting at 0
            for (int j = 0; j < bubble.length - i; j++) {
                //If the current item needs to be swapped with the next item, swap them
                if (bubble[j].compareTo(bubble[j + 1]) > 0) {
                    tmpStr = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = tmpStr;
                }
            }
        }
        
    }

    public static void selectionSort(String[] select) {
        int selectIndex; //A temporary index variable
        String tmpStr = ""; //A temporary string variable
        for (int i = 0; i < select.length - 1; i++) { //Loop through the list
            selectIndex = i; //Set the selectIndex to i (the start of the sublist)
            for (int j = i + 1; j < select.length; j++) { //Loop through the sublist
                //Find the item that should be at the top of the sublist
                if (select[selectIndex].compareTo(select[j]) > 0) {
                    selectIndex = j;
                }
            }
            //Swap the item at the top of the sublist with what should be at the top of the sublist
            tmpStr = select[i];
            select[i] = select[selectIndex];
            select[selectIndex] = tmpStr;
        }
    }
    
    public static void insertionSort(String[] insert) {
        int insertIndex = 0; //A temporary index used in the insertion sort
        String tmpStr = ""; //A temporary string used in the insert sort
        //Loop through the array starting at 1 and ending before the last index
        for (int i = 1; i < insert.length - 1; i++) { 
            insertIndex = i; //Set the temporary index to the current index
            tmpStr = insert[insertIndex]; //Get the string at that index
            //While the string isn't in its proper sorted place, keep moving the index down
            while (insertIndex > 0 && tmpStr.compareTo(insert[insertIndex - 1]) < 0) {
                insert[insertIndex] = insert[insertIndex - 1];
                insertIndex--;
            }
            //One it has found it's location, insert it
            insert[insertIndex] = tmpStr;
        }
    }

    public static void mergeSort(String[] table) {
        if (table.length > 1) { //A array of length one is already sorted
            int halfSize = table.length / 2; //Cut the array in half
            //Create a left array the size of the half 
            String[] leftTable = new String[halfSize]; 
            //Create a right array the size of the other half
            String[] rightTable = new String[table.length - halfSize];
            //Copy the first half of the array to the left array
            System.arraycopy(table, 0, leftTable, 0, halfSize);
            //Copy the second half of the array to the right array
            System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize); //Copy the second
            mergeSort(leftTable); //Sort the left array
            mergeSort(rightTable); //Sort the right array
            merge(table, leftTable, rightTable); //Merge the newly sorted lists back together
        }
    }

    public static void merge(String[] output, String[] left, String[] right) {
        int i = 0; //Left index
        int j = 0; //Right index
        int k = 0; //Output index
        //While there are still unmerged items 
        while (i < left.length && j < right.length) {
            //If the next item in the left list goes before the next item in the right list
            //put it into the next index in the output array
            if (left[i].compareTo(right[j]) < 0) {
                output[k++] = left[i++];
            } else { //Otherwise put the next item in the right array
                output[k++] = right[j++];
            }
        }
        //Put the rest of the items in the left array into the output
        while (i < left.length) {
            output[k++] = left[i++];
        }
        //Put the rest of the items in the left array into the output
        while (j < right.length) {
            output[k++] = right[j++];
        }
    }
}
