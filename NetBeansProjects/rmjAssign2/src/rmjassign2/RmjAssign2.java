package rmjassign2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Class: Data Structures
 * Assignment: Assignment #2B
 * @author Ryan Johnson
 * Date of Last Modification: 9/28/2012
 * Description: This program takes in a initial condition for the game of life
 * and then 20 generations are played on it. After these 20 generations, a solution
 * to go from the upper left hand corner the lower right corner, like a maze, is found.
 * Live cells are used as walls and dead cells are used as empty spaces to navigate.
 * The path that is needed to solve the maze outputted to a file called "output.txt".
 */
public class RmjAssign2 {

    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in); //Initialize the scanner to get input
        String verbose = cin.next(); //Get the verbose state
        int r = cin.nextInt(); //Get the number of rows
        int c = cin.nextInt(); //Get the number of columns
        Maze maze; //Initialize the maze object
        int[][] mazeArray = new int[r+2][c+2]; //Create the maze array with extra rows and columns for surrounding walls
        Generation gen; //Initialize a generation object
        char[] tempChars; //Temporray char array 
        
        for (int i = 1; i <= r; i++) { //Loop through each row of the input
            tempChars = cin.next().toCharArray(); //Get the entire row into a char array
            for (int j = 1; j <= tempChars.length; j++) { //Loop through the char array
                mazeArray[i][j] = Integer.parseInt(""+tempChars[j-1]); //Parse the character into the maze array
            }
        }
        gen = new Generation(mazeArray); //Pass the maze array to the generation object
        gen.showGenerations(20); //Run show generation 20 times
        mazeArray = gen.getMaze(); //Now that the generations have run, set the mazeArray to the new maze
        maze = new Maze(mazeArray); //Pass the new maze array to the maze object
        maze.solveMaze(verbose); //Solve the maze, passing the verbose state
    }
}
