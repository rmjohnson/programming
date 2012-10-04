package rmjassign2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryan
 */
public class Maze {

    int r, c, x, y, steps; //Rows, columns, x-coordinate, y-coordinate, and total number of steps
    int[][] maze; //The maze to be solved
    MyStack<Coordinate> stack; //The stack to use while solving the maze
    Coordinate tempCoord; //A temporary coordinate variable used while popping the stack
    String[] tempStrs; //Used to output the coordinates to the file

    public Maze(int[][] mazeArray) {
        this.r = mazeArray.length - 2; //r is the length of the array minus the top and bottom outside walls
        this.c = mazeArray[0].length - 2; //c is the length of the first row minus the side walls
        this.x = 1; //Start at the x coordinate of 1
        this.y = 1; //Start at the y coordinate of 1
        this.steps = 1; //Start steps at 1, includes the first spot
        this.maze = mazeArray; //Set the maze to the passed mazeArray
        stack = new MyStack(); //Create a new empty stack
    }

    public int[][] getMaze() {
        return maze;
    }

    public void solveMaze(String verbose) throws IOException {
        int flag;

        //Fill the sides with walls
        for (int i = 0; i <= r + 1; i++) {
            maze[i][0] = 1;
            maze[i][c + 1] = 1;
        }
        //Fill the top and bottom with walls
        for (int i = 0; i <= c + 1; i++) {
            maze[0][i] = 1;
            maze[r + 1][i] = 1;
        }
        stack.push(new Coordinate(x, y));
        while (!(x == c && y == r)) { //While you haven't gotten to the end of the maze
            flag = 0;
            maze[y][x] = -1;
            if (maze[y + 1][x] == 0) { //Check down to see if you can move there
                stack.push(new Coordinate(x, ++y)); //Push the new coordinates onto the stack
                flag = 1; //Let the program know you have moved
                steps++; //Increase the total number of steps taken
            } else if (maze[y][x + 1] == 0) { //Check right to see if you can move there
                stack.push(new Coordinate(++x, y)); //Push the new coordinates onto the stack
                flag = 1; //Let the program know you have moved
                steps++; //Increase the total number of steps taken
            } else if (maze[y][x - 1] == 0) { //Check left to see if you can move there
                stack.push(new Coordinate(--x, y));
                flag = 1; //Let the program know you have moved
                steps++; //Increase the total number of steps taken
            } else if (maze[y - 1][x] == 0) { //Check up to see if you can move there
                stack.push(new Coordinate(x, --y));
                flag = 1;  //Let the program know you have moved
                steps++; //Increase the total number of steps taken
            }
            if (flag == 0) { //If you were unable to move
                if (stack.isEmpty()) { //And you can't move back because the stack is empty
                    break; //Break the loop, steps should be 0 so no solution will printed to the file
                } else {
                    tempCoord = stack.pop(); //Pop the coordinates off the stack
                    x = tempCoord.getX(); //Move to the new coordinates
                    y = tempCoord.getY(); //Move to the new coordinates
                    steps--; //Subtract one from step, this direction didn't work
                }
            }
            if (verbose.equals("v")) { //If verbose mode is on
                outputMaze(); //Output the maze to show the steps every time.
            }
        }

        outputSteps(); //Output the steps to the file
    }

    public void outputSteps() throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("output.txt")); //Initialize the file writer
        if (steps == 0) { //If no steps were taken
            output.print("No solution"); //Print out no solution
        } else { //Otherwise...
            tempStrs = new String[steps];
            int i = 0;
            while (!stack.isEmpty()) { //While the stack is not empty
                tempCoord = stack.pop();  //Pop the coordinate off the stack
                tempStrs[i] = ("(" + (tempCoord.getY()-1) + "," + (tempCoord.getX()-1) + ")"); //Place it into an array to be printed
                i++; //Incrememnt the index
            }
            output.println("Total Steps: " + steps); //Print out the numbers of steps
            output.println("(0,0)"); //Print out the starting coordinate
            for (int j = i-1; j >= 0; j--) { //Loop through the array in reverse
                output.println(tempStrs[j]); //Print out the coordinate string to the file
            }
        }
        output.close(); //Close the file writer
    }

    public void outputMaze() {
        char tempC = ' '; //A temporary character used when changing 0,1, and -1 to symbols
        for (int i = 0; i < maze.length; i++) { //Loop through each row
            for (int j = 0; j < maze[i].length; j++) { //Loop through each column
                switch (maze[i][j]) {
                    case 1:
                        tempC = '#'; //Change 1s to #s
                        break;
                    case -1:
                        tempC = '.'; //Change -1s to .s
                        break;
                    case 0:
                        tempC = ' '; //Change 0s to spaces
                        break;
                }
                if (i == y && j == x) {
                    tempC = '*'; //Change the current x and y position to a *
                }
                System.out.print(tempC); //print out the character
            }
            System.out.println(""); //Print a new line for the new column
        }
        System.out.println(""); //Print a new line for the next maze to be outputted
    }
}
