package exercise12;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Class: Computer Science II
 * Assignment: Exercise 12.10
 * @author Ryan Johnson
 * Date of Last Modification: 3/4/2012
 * Description: This program displays a grid of buttons with checkered white
 * and black background to mimic a chess board.
 */
public class Exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setLayout(new GridLayout(8, 8));
        frame.setTitle("Exercise12_10");

        JButton[][] cells = new JButton[8][8];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = new JButton();
                if (i % 2 == 0 && j % 2 == 0) {
                    cells[i][j].setBackground(Color.white);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    cells[i][j].setBackground(Color.white);
                } else {
                    cells[i][j].setBackground(Color.black);
                }
                cells[i][j].setVisible(true);
                frame.add(cells[i][j]);

            }
        }

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
