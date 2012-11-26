/*
 * Reading and modifying various types of files.
 */
package fileinputoutput;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ryan
 */
public class FileInputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt","dat");
        jfc.setFileFilter(filter);
        if( jfc.showOpenDialog(jfc)==JFileChooser.APPROVE_OPTION) {
            try {
                long start = System.nanoTime();
                // open a scanner to read the file
                Scanner fileIn = new Scanner(jfc.getSelectedFile());
                PrintWriter fileOut = new PrintWriter(jfc.getSelectedFile().getAbsolutePath() + ".copy.txt");
                while(fileIn.hasNext()) {
                    fileOut.write(fileIn.nextLine()+"\n");
                }
                fileOut.write("The new end\n");
                fileOut.close();
                System.out.println("Time to copy text file:" + ((System.nanoTime()-start)/1000000000.0)+" seconds.");
                
                start = System.nanoTime();
                FileInputStream inStream = new FileInputStream(jfc.getSelectedFile());
                FileOutputStream outStream = new FileOutputStream(jfc.getSelectedFile().getAbsolutePath()+".bin");
                byte[] bytes = new byte[inStream.available()];
                inStream.read(bytes);
                outStream.write(bytes);
                outStream.write("The new End".getBytes());
                outStream.close();
                System.out.println("Time to copy binary file:" + ((System.nanoTime()-start)/1000000000.0)+" seconds.");
                
                start = System.nanoTime();
                RandomAccessFile raFile = new RandomAccessFile(jfc.getSelectedFile(), "rw");
                long size = raFile.length();
                raFile.seek(size/2);
                raFile.writeChars("Luke, I am your father.");
                raFile.close();
                System.out.println("Time to modify file using random access:" + ((System.nanoTime()-start)/1000000000.0)+" seconds.");
                
            } catch (IOException ex) {
                Logger.getLogger(FileInputOutput.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
