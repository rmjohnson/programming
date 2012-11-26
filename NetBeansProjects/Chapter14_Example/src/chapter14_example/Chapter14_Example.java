package chapter14_example;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Chapter14_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Calendar c1 = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar(1992, 9, 20);

        System.out.println((c1.getTimeInMillis()-c2.getTimeInMillis())/1000.0/60/60/24/365.24);
        */
        
        //Calculate the factorial of a given value
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = cin.nextInt();
        BigInteger factorialValue; //= new BigInteger("1");
        /*for (int i = number; i >= 1; i--) {
            factorialValue = factorialValue.multiply(new BigInteger(""+i));
        }*/
        factorialValue = rFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorialValue);
    }

    public static BigInteger rFactorial(int n) {
        if(n <=1)
            return BigInteger.ONE;
        return rFactorial(n-1).multiply(new BigInteger(""+n));
    }
}
