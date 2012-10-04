/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_example;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class ShapePanel extends JPanel {

    Shape[] shapes;

    public ShapePanel(Shape[] shapes) {
        this.shapes = shapes;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(g);
        }

    }
}
