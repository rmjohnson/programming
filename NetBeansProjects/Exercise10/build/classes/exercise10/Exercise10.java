package exercise10;

/**
 * Class: Computer Science II
 * Assignment: Exercise 10.11
 * @author Ryan Johnson
 * Date of Last Modification: 2/21/2012
 * Description: This program creates an object of the Circle2D class and shows
 * off the various methods that the class has. These methods include getArea,
 * getPerimeter, check if a point or a circle is contained with the circle, and
 * check if the circle overlaps with another.
 */
public class Exercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("Area of C1:" + c1.getArea());
        System.out.println("Perimeter of C1: " + c1.getPerimeter());
        System.out.println("Result of contains(3,3)" + c1.contains(3, 3));
        System.out.println("Result of contains circle: " + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("Result of overlaps circle: " + c1.overlaps(new Circle2D(3,5,2.3)));
    }
}
