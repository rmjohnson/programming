/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_example;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Ryan
 */
public class Chapter11_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[100];
        for (int i = 0; i < shapes.length; i++) {
            if(Math.random() >= 0.5) {
                shapes[i] = new Circle(
                    (int) (Math.random() * 50 + 10),
                    new Color(
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256)),
                    (int) (Math.random() * 350 + 50),
                    (int) (Math.random() * 350 + 50),
                    Math.random() >= 0.5);
            } else {
                shapes[i] = new Rectangle(
                    (int) (Math.random() * 100 + 10),
                    (int) (Math.random() * 75 + 10),
                    (int) (Math.random() * 350 + 50),
                    (int) (Math.random() * 350 + 50),
                    new Color(
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256),
                        (int) (Math.random() * 256)),
                    Math.random() >= 0.5);
            }
            
            System.out.println(shapes[i]);
            
        }
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapePanel panel = new ShapePanel(shapes);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
