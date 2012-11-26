package rmjassign4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

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

public class Graph {

    int[][] graph; //Store the graph in an multidimensional array
    //All the necessary arrays needed throughout the class
    int[] topOrder, earlyStage, lateStage, earlyActivity, lateActivity, critActivities;
    //All the necesseary integers needed throughout the class
    int totalStages, activitiesCount, critActivitiesCount, totalProjectTime;
    Boolean feasible; //Whether or not the project is feasible

    public Graph(int[][] graph) { //Construct the graph object
        this.graph = graph; //Set the graph to the graph parameter
        totalStages = graph.length - 1; //Set the total number of stages to the length of the graph - 1
        feasible = true; //Default feasible to true, will be changed to false if its not
        calcTopOrder(); //Calculate the topological order
        if (feasible) { //If the project is feasible
            calcEarlyStage(); //Calculate the early stage times
            calcLateStage(); //Calculate the late stage times
            calcActivities(); //Calculate the early and late activity times
        }
    }

    private void calcTopOrder() {
        Stack<Integer> topStack = new Stack<>(); //Initialize the stack
        //Inititalize the topOrder array to be the size of the number of stages
        topOrder = new int[totalStages];
        int currentStage; //A temporray current stage variable
        int topCount = 0; //Keep track of where in the array the program is
        for (int i = 1; i <= totalStages; i++) { //Loop through the stages
            if (graph[0][i] == 0) { //If the number of predecessors is 0
                topStack.push(i); //Push the stage to the stack
                //Set the number of predecessors to -1 so it isn't added to the stack again
                graph[0][i] = -1;
            }
        }
        //While there are still stages to be added to the toplogical order
        while (topCount < totalStages) {
            currentStage = topStack.pop(); //Get the next stage off the top of the stack
            topOrder[topCount++] = currentStage; //Put the current stage in the array
            //Loop through the predecessors
            for (int i = 1; i < graph[currentStage].length; i++) {
                if (graph[currentStage][i] != 0) //Decrement the current stage's succesors
                {
                    graph[0][i]--;
                }
            }

            for (int i = 1; i <= totalStages; i++) { //Loop through the stages
                if (graph[0][i] == 0) { //If the number of predecessors is 0
                    topStack.push(i); //Push the stage to the stack
                    //Set the number of predecessors to -1 so it isn't added to the stack again
                    graph[0][i] = -1;
                }
            }
            //If all the stages haven't been added to the topological order and the stack is empty
            if (topStack.isEmpty() && topCount != totalStages) {
                feasible = false; //Set feasible to false
                break; //and break
            }
        }
    }

    private void calcEarlyStage() {
        earlyStage = new int[totalStages]; //Initialize the early stage array to the size of the number of stages
        int max; //A temporary maximum variable
        int currentStage; //A temporary current stage variable, used to track the current stage
        //Set the first stage to have an early time of 0
        earlyStage[topOrder[0] - 1] = 0;  //Set the first stage's early time to 0
        for (int i = 0; i < topOrder.length; i++) { //Loop through the topological order
            max = 0; //Initialize the maximum to zero
            currentStage = topOrder[i]; //Get the current stage from the topological order
            for (int j = 1; j < graph[currentStage].length; j++) { //Loop through the current stage's row
                //If the weight of the activity plus the the early stage of the last early stage's weight is greater than the max
                if (graph[j][currentStage] + earlyStage[j - 1] > max) {
                    max = graph[j][currentStage] + earlyStage[j - 1]; //Set the max to their sum
                }
            }
            earlyStage[currentStage - 1] = max; //Set the early stage to the maximum found
        }
    }

    private void calcLateStage() {
        //Initialize the late stage array to the size of the total stages
        lateStage = new int[totalStages];
        //The total project time is the last stage's (in the topological order) early stage time
        totalProjectTime = earlyStage[topOrder[totalStages - 1] - 1];
        //The last stage's (in the topological order) time is the total project time
        lateStage[topOrder[totalStages - 1] - 1] = totalProjectTime;
        int min; //A mimimum temporary variable

        //Reverse loop through topOrder
        for (int i = totalStages - 2; i > 0; i--) {
            min = lateStage[topOrder[i + 1] - 1]; //The minimum is the previous stage's late time
            //Loop through the current stage's column
            for (int j = 1; j < graph[topOrder[i]].length; j++) {
                //If the previous late stage's time minus the weight is less than the mimimum and the weight isn't 0
                if (lateStage[j - 1] - graph[topOrder[i]][j] < min && lateStage[j - 1] != 0) {
                    min = lateStage[j - 1] - graph[topOrder[i]][j]; //Set the minimum to that number
                }
            }
            lateStage[topOrder[i] - 1] = min; //Set the late stage's time to the minimum
        }
    }

    private void calcActivities() {
        activitiesCount = 0; //Initialize the activities count to 0
        //Initialize the activities arrays to totalStages * totalStages, the most there could be
        lateActivity = new int[totalStages * totalStages];
        earlyActivity = new int[totalStages * totalStages];
        critActivities = new int[totalStages * totalStages];
        critActivitiesCount = 0; //Initialize the activities count to 0

        for (int i = 1; i < graph.length; i++) { //Loop through the graph's rows
            for (int j = 1; j < graph[i].length; j++) { //Loop through the graph's columns
                if (graph[i][j] != 0) { //If the weight isn't 0, its an activity
                    //Get the early stage's time and set it to the early activity time
                    earlyActivity[activitiesCount] = earlyStage[i - 1];
                    //Get the late stage's time minus the weight to get the late activity time
                    lateActivity[activitiesCount] = lateStage[j - 1] - graph[i][j]; 
                    //If the early and late activity times are the same
                    if (earlyActivity[activitiesCount] == lateActivity[activitiesCount]) {
                        //then they are a critical activity and should be added to the critical activity array
                        critActivities[critActivitiesCount++] = activitiesCount + 1;
                    }
                    activitiesCount++; //Increment the activities count
                }
            }
        }
    }

    public void output(String filename) throws IOException {
        //Create the output file
        PrintWriter out = new PrintWriter(new FileWriter(filename + ".rpt.txt"));
        if (!feasible) { //If the project is not feasible
            out.print("Project is not feasible"); //Output that the project isn't feasible
            out.close(); //Close the file
            return; //Exit the method
        }
        out.println("Project is feasible"); //Output that the project is feasible
        out.println(); //Output a blank line
        out.print("Ordering: "); //Output an "Ordering: " label
        for (int i = 0; i < topOrder.length; i++) { //Loop through the topological order
            out.print(topOrder[i] + " "); //Output each number in the topological order
        }
        out.println(); //Output a blank line
        out.println("Stage \t Early \t Late"); //Output label headers for the early and late stage timings
        for (int i = 0; i < topOrder.length; i++) { //Loop through the stage timings
            out.println((i + 1) + "\t" + earlyStage[i] + "\t" + lateStage[i]); //Output the number and its early and late stage times
        }
        out.println(); //Output a blank line
        out.println("Total Project Time: " + totalProjectTime); //Output the total project time
        out.println(); //Output a blank line
        out.println("Activities \t Early \t Late"); //Output label headers for the early and late activity timings
        for (int i = 0; i < activitiesCount; i++) { //Loop through the activity timings
            out.println((i + 1) + "\t" + earlyActivity[i] + "\t" + lateActivity[i]); //Output the number and its early and late stage times
        }
        out.print("Critical Activities: "); //Output the critical activities label
        for (int i = 0; i < critActivitiesCount; i++) { //Loop through the critical activities
            out.print(critActivities[i]); //Output the critical activities
            if (i != critActivitiesCount - 1) { //If the critical activity, isn't the last one
                out.print(", "); //Output a comma and a space
            }
        }
        out.close(); //Close the file
    }
}