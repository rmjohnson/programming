/*
 * Generate 2D mazes.
 */
package mazergenerator;

import java.util.Stack;

/**
 *
 * @author Ryan Johnson
 */
public class MazerGenerator {

    /**
     * @param args the command line arguments
     */
    static final int MAZE_ROWS = 21;
    static final int MAZE_COLS = 51;

    public static void main(String[] args) {
        int[][] maze = new int[MAZE_ROWS][MAZE_COLS];

        // initialize the maze
        initialize_Maze(maze);
        // generate the maze
        //generate_Maze();
        // display the maze
        display_Maze(maze);
    }

    /**
     * Initialize the maze with borders and walls.
     *
     * @param m
     */
    public static void initialize_Maze(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == 0 || j == 0 || i == MAZE_ROWS - 1 || j == MAZE_COLS - 1) {
                    m[i][j] = 2;
                } else if (i % 2 != 0 || j % 2 != 0) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
    }

    public static void generate_Maze(int[][] m) {
        int i = 2;
        int j = 2;
        int k;

        Stack stack = new Stack();
        stack.push(i);
        stack.push(j);
        while (!stack.empty()) {
            // look for univisited neighbors
            for (k = 0; k < 10; k++) {
                int n = (int)(Math.random() * 4);
                if (n==0) {
                    // north neighbor
                    if (m[i-2][j] != 2 && m[i-2][j] != 3) {
                        // remove the wall
                        m[i-1][j] = 0;
                        // set neighbor to visited
                        m[i-2][j] = 3;
                        // save current location
                        stack.push(i);
                        stack.push(j);
                        // move to neighbor
                        i=i-2;
                        break;
                    }
                } else if(n==1) {
                    // east neighbor
                    if (m[i][j + 2] != 2 && m[i][j+2] != 3) {
                        // remove the wall
                        m[i][j + 1] = 0;
                        // set neighbor to visited
                        m[i][j + 2] = 3;
                        // save current location
                        stack.push(i);
                        stack.push(j);
                        // move to neighbor
                        j=j+2;
                        break;
                    }
                } else if(n==2) {
                    // south neighbor
                    if (m[i+2][j] != 2 && m[i+2][j] != 3) {
                        // remove the wall
                        m[i+1][j] = 0;
                        // set neighbor to visited
                        m[i+2][j] = 3;
                        // save current location
                        stack.push(i);
                        stack.push(j);
                        // move to neighbor
                        i=i+2;
                        break;
                    }
                } else if(n==3) {
                    // west neighbor
                    if (m[i][j - 2] != 2 && m[i][j - 2] != 3) {
                        // remove the wall
                        m[i][j - 1] = 0;
                        // set neighbor to visited
                        m[i][j - 2] = 3;
                        // save current location
                        stack.push(i);
                        stack.push(j);
                        // move to neighbor
                        j=j-2;
                        break;
                    }
                }
            }
            if(k==10) {
                j = stack.pop();
                i = stack.pop();
            }
            
        }
        System.out.println("Maze generation complete.");
    }

    /**
     * Display the maze on the console.
     *
     * @param m
     */
    public static void display_Maze(final int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                switch (m[i][j]) {
                    case 0:
                    case 3:
                        System.out.print(" ");
                        break;
                    case 1:
                    case 2:
                        System.out.print((char)222);
                        break;
                    default:
                        System.out.print("?");
                        break;
                }
            }
            System.out.println("");
        }
    }
}