/*
 * Shape super class of shapes
 */
package chapter11_example;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ryan
 */
public class Shape {
    protected int x;
    protected int y;
    protected Color color;
    protected boolean filled;

    public Shape(int x, int y, Color color, boolean filled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }

    public void draw(Graphics g) {
        
    }
    
    @Override
    public String toString() {
        return super.toString()+"\n Shape (x,y): ("+x+","+y+") color: "+color+
                " filled: "+filled;
    }
        
    
}
