package hashtable;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class HashTable {

    public static void main(String[] args) throws FileNotFoundException {
        int probes;
        int numwords = 45403;
        int size;
        String[] table;
        String word;
        int hashIndex;
        double tmpProbes;
        int tmpHashIndex;
        File f;
        Scanner in;

        for (double loadFactor = 1; loadFactor >= 0.5; loadFactor -= 0.05) {
            DecimalFormat df = new DecimalFormat("#.##");
            loadFactor = Double.parseDouble(df.format(loadFactor));
            size = (int) (numwords * (1/loadFactor));
            f = new File("dictionary.txt");
            in = new Scanner(f);
            table = new String[size];
            probes = 0;
            
            //Linear Probe
            for (int i = 0; i < numwords; i++) {
                word = in.nextLine();
                hashIndex = Math.abs(word.hashCode() % size);
                //System.out.println(hashIndex);
                while (table[hashIndex] != null) {
                    probes++;
                    if (hashIndex != size - 1) {
                        hashIndex++;
                    } else {
                        hashIndex = 0;
                    }
                }
                table[hashIndex] = word;

            }
            System.out.println("Linear Load Factor: " + loadFactor);
            System.out.println("Linear Probes: " + probes);

            //Reset everything for the quadratic probe
            probes = 0;
            f = new File("dictionary.txt");
            table = new String[size];
            in = new Scanner(f);
            
            //Quadratic Probe
            for (int i = 0; i < numwords; i++) {
                word = in.nextLine();
                hashIndex = Math.abs(word.hashCode() % size);
                tmpProbes = 0;
                tmpHashIndex = hashIndex;
                while (table[tmpHashIndex] != null) {
                    tmpProbes++;
                    tmpHashIndex = (int) ((hashIndex + tmpProbes * tmpProbes) % size);
                }
                probes += tmpProbes;
                //System.out.println(tmpHashIndex + " " + probes);
                table[tmpHashIndex] = word;
            }

            System.out.println("Quadratic Load Factor: " + loadFactor);
            System.out.println("Quadratic Probes: " + probes);
        }
    }
}
