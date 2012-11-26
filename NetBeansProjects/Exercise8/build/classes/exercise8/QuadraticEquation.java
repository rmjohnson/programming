package exercise8;

/**
 * Class: Computer Science II
 * Assignment: Exercise 8.10
 * @author Ryan Johnson
 * Date of Last Modification: 2/15/2012
 * Description: This class is a quadratic equation that allows you to get the
 * discriminate and the roots from a given a,b, and c.
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    /**
     * Constructor for the QuadraticEquation class.
     * @param a
     * @param b
     * @param c 
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Returns the value of a.
     * @return 
     */
    public double getA() {
        return a;
    }
    /**
     * Returns the value of b.
     * @return 
     */
    public double getB() {
        return b;
    }
    /**
     * Returns the value of c.
     * @return 
     */
    public double getC() {
        return c;
    }
    /**
     * Gets the discriminant of a quadratic equation.
     * @return 
     */
    public double getDiscriminant() {
        return (b*b) - (4 * a * c);
    }
    /**
     * Gets the first root if the discriminant is greater than 0, otherwise
     * return 0.
     * @return 
     */
    public double getRoot1() {
        if(getDiscriminant() < 0) {
            return 0;
        } else {
            return (-1*b + Math.sqrt(getDiscriminant()))/(2*a);
        }
    }  
    
    /**
     * Gets the second root if the discriminant is greater than 0, otherwise
     * return 0.
     * @return 
     */
    public double getRoot2() {
        if(getDiscriminant() < 0) {
            return 0;
        } else {
            return (-1*b - Math.sqrt(getDiscriminant()))/(2*a);
        }
    }
}
