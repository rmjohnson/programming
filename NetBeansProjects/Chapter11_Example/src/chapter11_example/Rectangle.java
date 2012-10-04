/*
 * Rectangle shape class
 */
package chapter11_example;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ryan
 */
public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width, int x, int y, Color color, boolean filled) {
        super(x, y, color, filled);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        if(filled) {
            g.fillRect(x, y, width, height);
        } else {
            g.drawRect(x, y, width, height);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\n Rectangle width: "+width+" height: "+height;
    }
}
