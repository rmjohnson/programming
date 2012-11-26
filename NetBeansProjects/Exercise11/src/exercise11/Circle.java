package exercise11;

import java.awt.Color;

/**
 *
 * @author Ryan Johnson
 * A circle object
 */
public class Circle {

    private int radius;
    private int x;
    private int y;
    private Color color;
    private boolean filled;

    public Circle() {
        this((int) (Math.random() * 50 + 10),
                new Color((int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)),
                (int) (Math.random() * 350 + 50),
                (int) (Math.random() * 350 + 50),
                Math.random() >= 0.5);
    }

    public Circle(int radius, Color color, int x, int y, boolean filled) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
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
    public String toString() {
        return "(x,y): (" + x + "," + y + ") color: " + color
                + " filled: " + filled + "\n Circle radius: " + radius;
    }
}
