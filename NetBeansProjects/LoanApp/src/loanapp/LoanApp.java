/*
 * CS 2
 */
package loanapp;

import java.util.Scanner;

/**
 *
 * @author Ryan Johnson
 * @classdescription Calculate the monthly payment for a given loan.
 * 
 */
public class LoanApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get the loan values and output the monthly payment
        Scanner cin = new Scanner(System.in);
        double loanAmt;
        double monthlyInterestRate;
        int termInMonths;
        double monthlyPayment;
        
        System.out.print("Enter the loan amount: ");
        loanAmt = cin.nextDouble();
        System.out.print("Enter the annual interest rate [0.08 = 8%]: ");
        monthlyInterestRate = cin.nextDouble()/12;
        System.out.print("Enter the number of years: ");
        termInMonths = cin.nextInt()*12;
        
        monthlyPayment = loanAmt * monthlyInterestRate / 
                (1 - 1 / Math.pow(1 + monthlyInterestRate,termInMonths));
        System.out.printf("Monthly payment: $%.2f\n",monthlyPayment);
        
        System.out.printf("Total payment on loan: $%.2f\n",monthlyPayment*termInMonths);
        
    }
}
