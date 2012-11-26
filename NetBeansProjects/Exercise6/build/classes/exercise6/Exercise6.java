package exercise6;

import java.util.Scanner;

/**
 * Class: Computer Science II
 * Assignment: Exercise 6.11
 * @author Ryan Johnson
 * Date of Last Modification: 2/1/2012
 * Description: This program gets an input of 10 numbers
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] xArray = new double[10];
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < xArray.length; i++) {
            xArray[i] = cin.nextDouble();
        }
        System.out.printf("The mean is %.2f\n", mean(xArray));
        System.out.printf("The standard deviation is %.5f\n", deviation(xArray));
    }
    
    /**
     * Compute the deviation of double values
     * @param x
     * @return 
     */
    public static double deviation(double[] x) {
        double dev=0;
        for (double i : x) {
            dev += Math.pow(i - mean(x),2);
        }
        dev = Math.pow(dev/(x.length - 1),0.5);
        return dev;
    }
    /**
     * Compute the mean of an array of double values
     * @param x
     * @return 
     */
    public static double mean(double[] x) {
        double mean=0;
        for (double i : x) {
            mean += i;
        }
        return mean/x.length;
    }
    
}
