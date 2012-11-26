package rmjassign4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class: Data Structures
 * Assignment: Assignment #4B
 * @author Ryan Johnson
 * Date of Last Modification: 11/26/2012
 * Description: This program asks the user for a a project file to construct a 
 * graph off of. An adjacency matrix is created from the information in the graph
 * and then the topological order is determined. Using the topological order, the early
 * and late stage times are determined. Using those early and late stage times,
 * the activity early and late times are calculated along with critical activities
 * and total project time.
 */
public class RmjAssign4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner keyIn; //Used to get the user's inputted file name
        Scanner in; //Used to read in the file
        int totalStages; //Used to take in the total number of stages from the project file
        int tmpActivities; //Used to take in the activity weights
        int endStage; //Used to get the end stage of the activity
        int[][] graphArray; //Used to store the graph to be passed to the graph class
        Graph graph; //The graph class, does all calculations and output
        String fileName; //Store the filename so it can be passed to the output
               
        //A description of the problem and a prompt for the file name
        System.out.println("Enter in a project file to be analyzed to find out "
                + "the topological order of the stages and what the earliest and "
                + "latest times that these stages can be done to complete in "
                + "the project in the shortest amount of time.");
        System.out.print("Name of project description file: ");
        keyIn = new Scanner(System.in); //Inititalize the system.in scanner
        fileName = keyIn.next(); //Take in the project's file name
        in = new Scanner(new File(fileName)); //Start a scanner with the file
        totalStages = in.nextInt(); //Get the total number of stages from the file
        //Initialize the graph array to [totalStages+1][totalStages+1] so 
        //the stage numbers can be directly indexed (stage 1 is index 1)
        graphArray = new int[totalStages+1][totalStages+1]; 
        
        //Loop through the total number of stages
        for (int i = 1; i <= totalStages; i++) {
            in.nextInt(); //Throw away stage label
            tmpActivities = in.nextInt(); //Get the number of activities for the current stage
            for (int j = 0; j < tmpActivities; j++) { //Loop through the activities
                endStage = in.nextInt(); //Get the end stage
                graphArray[i][endStage] = in.nextInt(); //Get the weight of the end stage
                graphArray[0][endStage]++; //Increment the number of predecessors for the current stage
            }
        }
        
        graph = new Graph(graphArray); //Send the graph array to the graph class
        graph.output(fileName); //Output the graph
    }
}
