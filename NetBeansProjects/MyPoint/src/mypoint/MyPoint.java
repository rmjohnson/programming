/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

/**
 *
 * @author Ryan
 */
public class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this(0,0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    /**
     * Calculates the distance to a passed point.
     * @param point
     * @return double
     */
    public double distance(MyPoint point) {
        return(Math.sqrt(
               Math.pow(this.x - point.getX(),2) + 
               Math.pow(this.y - point.getY(),2)));
    }
}
