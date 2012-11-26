/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appletdemo;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ryan
 */
public class AppletDemo extends JApplet {

    public AppletDemo() {
        add(new JLabel("It's working!", JLabel.CENTER));
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new AppletDemo());
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
