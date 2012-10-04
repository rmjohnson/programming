package rmjassign2;

/**
 *
 * @author Ryan
 */
public class Generation {
    int[][] maze; //The maze array
    int[][] tempMaze; //A temporary maze array, used so all life/death calculates are done at the same time
    int r,c; //Number of rows and columns

    public Generation(int[][] maze) {
        this.maze = maze;
        r = maze.length-2; //r is the length of the array minus the top and bottom outside walls
        c = maze[0].length-2; //c is the length of the first row minus the side walls
        this.tempMaze = new int[maze.length][maze[0].length]; //Temp maze is the size of maze
    }

    public int[][] getMaze() {
        return maze; //So the maze can be given to the maze class
    }
    
    
    public void showGenerations(int numGens) {
        outputGeneration(1); //Output the first generation
        for (int i = 0; i < numGens-1; i++) { //Loop throught the number of generations needed
            tempMaze = new int[maze.length][maze[0].length]; //Reset the temporary maze
            for (int j = 1; j <= r; j++) { //Loop through the rows
                for (int k = 1; k <= c; k++) { //Loop through the columns
                    if(liveNeighbors(k,j) < 2) { //If the number of live neighbors is less than 2
                        tempMaze[j][k] = 0; //Kill the cell / set to 0
                    }
                    if(liveNeighbors(k,j) > 3) {
                        tempMaze[j][k] = 0; //Kill the cell / set to 0
                    }
                    if(liveNeighbors(k,j) == 3) {
                        tempMaze[j][k] = 1; //Birth the cell / set to 1
                    }
                    if(maze[j][k] == 1 && liveNeighbors(k,j) == 2) {
                        tempMaze[j][k] = 1; //Keep the cell alive / set to 1
                    }
                }
            }
            maze = tempMaze; //Set maze to the tempMaze for the next generation. Set all deaths/births.
            outputGeneration(i+2); //Output the current generation
        }
        
    } 
    
    public int liveNeighbors(int x, int y) {
        int numLive = 0; //Initialize the number of live neighbors
        for (int i = x-1; i <= x+1; i++) { //Loop through the adjacent rows
            for (int j = y-1; j <= y+1; j++) { //Loop through the adjacent columns
                if(!(i == x && j == y)) { //If the cell being checked is the current x,y
                    numLive += maze[j][i]; //Add the state (0 or 1) to the number of live neighbors
                }
            }
        }
        return numLive; //Return the number of live neighbors
    }
    
    public void outputGeneration(int genNum) {
        System.out.println(""); //Print out a blank line for spacing
        System.out.println("Generation " + genNum); //Print the generation label
        for (int i = 1; i <= r; i++) { //Loop through the rows
            for (int j = 1; j <= c; j++) { //Loop through the columns
                System.out.print(maze[i][j]); //Print out the current cell
            }
            System.out.println(""); //Print out a new line for the next row
        }
    }
}
