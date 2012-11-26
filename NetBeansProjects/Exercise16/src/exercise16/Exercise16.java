/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise16;

import javax.swing.JFrame;

/**
 *
 * @author Ryan
 */
public class Exercise16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise16_33");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PendulumPanel canvas = new PendulumPanel();
        canvas.setFocusable(true);
        frame.add(canvas);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
