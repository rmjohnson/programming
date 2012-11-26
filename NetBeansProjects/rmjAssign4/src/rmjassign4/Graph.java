package rmjassign4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

/**
 *
 * @author Ryan
 */
public class Graph {

    int[][] graph;
    int[] topOrder, earlyStage, lateStage, earlyActivity, lateActivity, critActivities;
    int totalStages, activitiesCount, critActivitiesCount, totalProjectTime;
    Boolean feasible;

    public Graph(int[][] graph) {
        this.graph = graph;
        totalStages = graph.length - 1;
        feasible = true;
        calcTopOrder();
        if (feasible) {
            calcEarlyStage();
            calcLateStage();
            calcActivities();
        }
    }

    private void calcTopOrder() {
        Stack<Integer> topStack = new Stack<>();
        topOrder = new int[totalStages];
        int currentStage;
        int topCount = 0;
        for (int i = 1; i <= totalStages; i++) {
            if (graph[0][i] == 0) {
                topStack.push(i);
                graph[0][i] = -1;
            }
        }
        while (topCount < totalStages) {
            currentStage = topStack.pop();
            topOrder[topCount++] = currentStage;
            for (int i = 1; i < graph[currentStage].length; i++) {
                if(graph[currentStage][i] != 0)
                    graph[0][i]--;
            }
            
            for (int i = 1; i <= totalStages; i++) {
                if(graph[0][i] == 0) {
                    topStack.push(i);
                    graph[0][i] = -1;
                }
            }
            if (topStack.isEmpty() && topCount != totalStages) {
                feasible = false;
                break;
            }
        }
    }

    private void calcEarlyStage() {
        earlyStage = new int[totalStages];
        int max;
        int currentStage;
        //Set the first stage to have an early time of 0
        earlyStage[topOrder[0] - 1] = 0; 
        for (int i = 0; i < topOrder.length; i++) {
            max = 0;
            currentStage = topOrder[i];
            for (int j = 1; j < graph[currentStage].length; j++) {
                if(graph[j][currentStage] + earlyStage[j-1] > max) {
                    max = graph[j][currentStage] + earlyStage[j-1];
                }
            }
            earlyStage[currentStage-1] = max;
        }
    }

    private void calcLateStage() {
        lateStage = new int[totalStages];
        totalProjectTime = earlyStage[totalStages-1];
        lateStage[totalStages-1] = totalProjectTime;
        int min;
        
        //Reverse loop through topOrder
        for (int i = totalStages-2; i > 0; i--) {
            min = lateStage[topOrder[i+1]-1];
            for (int j = 1; j < graph[topOrder[i]].length; j++) {
                if(lateStage[j-1] - graph[topOrder[i]][j] < min && lateStage[j-1] != 0)
                    min = lateStage[j-1] - graph[topOrder[i]][j];
            }
            lateStage[topOrder[i]-1] = min;
        }
    }

    private void calcActivities() {
        activitiesCount = 0;
        lateActivity = new int[totalStages*totalStages];
        earlyActivity = new int[totalStages*totalStages];
        critActivities = new int[totalStages*totalStages];
        critActivitiesCount = 0;
        
        for (int i = 1; i < graph.length; i++) {
            for (int j = 1; j < graph[i].length; j++) {
                if(graph[i][j] != 0) {
                    earlyActivity[activitiesCount] = earlyStage[i-1];
                    lateActivity[activitiesCount] = lateStage[j-1] - graph[i][j];
                    if(earlyActivity[activitiesCount] == lateActivity[activitiesCount]) {
                        critActivities[critActivitiesCount++] = activitiesCount+1;
                    }
                    activitiesCount++;
                }
            }
        }
    }

    public void output(String filename) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter(filename + ".rpt.txt"));
        if(!feasible) {
            out.print("Project is not feasible");
            out.close();
            return;
        }
        out.println("Project is feasible");
        out.println();
        out.print("Ordering: ");
        for (int i = 0; i < topOrder.length; i++) {
            out.print(topOrder[i] + " ");
        }
        out.println();
        out.println("Stage \t Early \t Late");
        for (int i = 0; i < topOrder.length; i++) {
            out.println((i + 1) + "\t" + earlyStage[i] + "\t" + lateStage[i]);
        }
        out.println();
        out.println("Total Project Time: " + totalProjectTime);
        out.println();
        out.println("Activities \t Early \t Late");
        for (int i = 0; i < activitiesCount; i++) {
            out.println((i+1) + "\t" + earlyActivity[i] + "\t" + lateActivity[i]);
        }
        out.print("Critical Activities: ");
        for (int i = 0; i < critActivitiesCount; i++) {
            out.print(critActivities[i]);
            if(i != critActivitiesCount-1)
                out.print(", ");
        }
        //out.print("");
        out.close();
    }
}