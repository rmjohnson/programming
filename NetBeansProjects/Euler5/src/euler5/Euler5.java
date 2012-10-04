/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler5;

/**
 *
 * @author Ryan
 */
public class Euler5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean breaker = true;
        long num = 1;
        while (breaker) {
            breaker = true;
            for (int i = 1; i <= 20; i++) {
                if (num % i != 0) {
                    breaker = false;
                }
            }
            num++;
            System.out.println(num);
        }
    }
}

