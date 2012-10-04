/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromes;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        MyStack<Character> pStack = new MyStack<Character>();
        System.out.print("Enter palindrome: ");
        String inStr = cin.next();
        
        // load string onto stack
        for (int i = 0; i < inStr.length(); i++) {
            pStack.push(inStr.charAt(i));
            
        }
        
        char ch = ' ';
        for (int i = 0; i < inStr.length(); i++) {
            ch = pStack.pop();
            if(ch != inStr.charAt(i)) {
                // not a palindrome
                break;
            }
        }
        if(!pStack.isEmpty()) {
            System.out.println(inStr + " is not a palindrome.");
        } else if (ch == inStr.charAt(inStr.length()-1)){
            System.out.println(inStr + " is a palindrome.");
        }
        
        
        
    }
}
