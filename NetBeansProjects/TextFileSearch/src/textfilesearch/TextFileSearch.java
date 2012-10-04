/*
 * Allow the uesr to select a text file
 * and search the file for words of interest.
 */
package textfilesearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Ryan Johnson
 */
public class TextFileSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File inFile;
        JFileChooser jfc = new JFileChooser();
        String inWord;
        String searchWord;

        if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            inFile = jfc.getSelectedFile();
            Scanner inFileScanner;
            System.out.print("Enter the search string[Blank to exit]: ");
            Scanner cin = new Scanner(System.in);
            searchWord = cin.nextLine();
            while (searchWord.length() > 0) {
                inFileScanner = new Scanner(inFile);
                System.out.println("Words Found:");
                while (inFileScanner.hasNext()) {
                    inWord = inFileScanner.next();
                    if (inWord.matches(searchWord)) {
                        System.out.println(inWord);
                    }
                }
                System.out.print("Enter the search string[Blank to exit]: ");
                searchWord = cin.nextLine();
                inFileScanner.close();
            }
        }
        System.out.println("Program terminated.");
    }
}
