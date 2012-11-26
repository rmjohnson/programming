package rmjassign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class RmjAssign4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner keyIn;
        Scanner in;
        int totalStages;
        int tmpActivities;
        int endStage;
        int[][] graphArray;
        Graph graph;
        String fileName;
                        
        System.out.println("DESCRIPTION OF PROBLEM!!!");
        System.out.print("Name of project description file: ");
        keyIn = new Scanner(System.in);
        fileName = "projectTest.txt";
        in = new Scanner(new File(fileName));
        totalStages = in.nextInt();
        graphArray = new int[totalStages+1][totalStages+1];
        
        for (int i = 1; i <= totalStages; i++) {
            in.nextInt(); //Throw away stage label
            tmpActivities = in.nextInt();
            for (int j = 0; j < tmpActivities; j++) {
                endStage = in.nextInt();
                graphArray[i][endStage] = in.nextInt();
                graphArray[0][endStage]++;
            }
        }
        
        graph = new Graph(graphArray);
        graph.output(fileName);
    }
}
