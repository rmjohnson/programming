package exercise10;

/**
 *
 * @author Ryan
 */
public class Circle2D {
    double x,y;
    double radius;
    /**
     * No-arg constructor, sets the x and y to 0 and the radius to 1.
     */
    public Circle2D() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }
    /**
     * Constructor for the circle class
     * @param x
     * @param y
     * @param radius 
     */
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    /**
     * Returns the x value of the circle
     * @return 
     */
    public double getX() {
        return x;
    }
    /**
     * Returns the y value of the circle
     * @return 
     */
    public double getY() {
        return y;
    }
    /**
     * Returns the radius of the circle
     * @return 
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Calculates the area of the circle using pi * (radius*radius).
     * @return 
     */
    public double getArea() {
        return Math.PI * (radius*radius);
    }
    /*
     * Calculates the perimeter by using 2 * pi * the radius.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    /**
     * Checks if the provided x and y are within the bounds of the circle.
     * @param x
     * @param y
     * @return 
     */
    public boolean contains(double x, double y) {
        //Check if the provided x and y cordinates are inside the circle
        if(x > (this.x-this.radius) || x < (this.x+this.radius)) {
            //Check if it is within the x cordinates
            if(y > (this.y-this.radius) || y < (this.y+this.radius)) {
                //Check if it is within the y cordinates
                return true;
            }
        }
        return false;
    }
    /**
     * Checks if an entire circle is within the bounds of a circle.
     * @param circle
     * @return 
     */
    public boolean contains(Circle2D circle) {
        //Check if the provided circle is inside the circle.
        if((circle.x-circle.radius) > (this.x-this.radius) && (circle.x+circle.radius) < (this.x+this.radius)) {
            //Check if the left and right sides are within the circle
            if((circle.y-circle.radius) > (this.y-this.radius) && (circle.y+circle.radius) < (this.y+this.radius)) {
                //Check if the top and bottom sides are within the circle
                return true;
            }
        }
        return false;
    }
    /**
     * Checks if a circle overlaps with another.
     * @param circle
     * @return 
     */
    public boolean overlaps(Circle2D circle) {
        //Check if the provided circle overlaps with the circle.
        if((circle.x-circle.radius) < (this.x+this.radius) || (circle.x+circle.radius) > (this.x-this.radius)) {
            return true;
        }
        if((circle.y-circle.radius) < (this.y+this.radius) || (circle.y+circle.radius) > (this.y-this.radius)) {
            return true;
        }
        return false;
    }
}
