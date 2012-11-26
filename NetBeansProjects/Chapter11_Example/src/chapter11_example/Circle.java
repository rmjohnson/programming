/*
 * Circle object
 */
package chapter11_example;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ryan
 */
public class Circle extends Shape{
    private int radius;

    public Circle(int radius, Color color, int x, int y, boolean filled) {
        super(x, y, color, filled);
        this.radius = radius;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        if(filled) {
            g.fillOval(x, y, radius*2, radius*2);
        } else {
            g.drawOval(x, y, radius*2, radius*2);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n Circle radius: "+radius;
    }
    
    
}
