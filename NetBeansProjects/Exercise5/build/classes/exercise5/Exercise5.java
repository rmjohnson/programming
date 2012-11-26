package exercise5;


/**
 *
 * Class: Computer Science II
 * Assignment: Exercise 5.27
 * @author Ryan Johnson
 * Date of Last Modification: 1/30/2012
 * Description: This program calculates the first 100 "emirps", which is a 
 * nonpalindromic prime whose reversal is also a prime. This is done by first
 * making sure it is not a palindrome by checking the number against its reverse.
 * Then, it checks if both it is a prime and it's reverse is a prime. The reverse
 * is found by converting the int to a string and then using StringBuilder.
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayEmirps();
    }
    /**
     * Prints out emirps. 
     */
    static void displayEmirps(){
        int count = 0;
        int num = 12;
        while(count < 100){
            if(isEmirp(num))
            {
                if(count%10==0)
                    System.out.println("");
                count++;
                System.out.print(num + "\t");
            }
            num++;
        }
        System.out.println("");
    }
    /**
     *  Checks if a number is an emirp.
     * @param num
     * @return 
     */
    static boolean isEmirp(int num){
        if(reverse(num) == num){
            return false;
        }
        if(isPrime(num) && isPrime(reverse(num)))
            return true;
        else
            return false;
    }
    /**
     * Reverses an int using stringbuilder.
     * @param num
     * @return 
     */
    static int reverse(int num){
        String numString = "" + num;
        StringBuilder stringBuilder = new StringBuilder(numString);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }
    /**
     * Checks if a number is prime.
     * @param num
     * @return 
     */
    static boolean isPrime(int num){
        boolean prime = true;
        for (int i = 2; i <= num/2 && prime; i++) {
            if(num%i==0)
                prime = false;
        }
        return prime;
    }
    
}
