/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcircle;

import javax.swing.JFrame;

/**
 *
 * @author Ryan
 */
public class ControlCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CirclePanel panel = new CirclePanel();
        panel.setFocusable(true);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

