package exercise4;

import java.util.Scanner;

/**
 *
 * Class: Computer Science II
 * Assignment: Exercise 4.22
 * @author Ryan Johnson
 * Date of Last Modification: 1/27/2012
 * Description: The program takes in a loan amount, a number of years, and an 
 * annual interest rate. Calculations are made to figure out the monthly payments.
 * Information for each month is then printed out to the screen.
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double loan, years, annual_rate, monthly_rate, monthly_payment, total, balance, principle, interest;
        Scanner cin = new Scanner(System.in);
        System.out.print("Please enter the loan amount: ");
        loan = cin.nextDouble();
        System.out.print("Please enter the number of years: ");
        years = cin.nextDouble();
        System.out.print("Please enter the interest rate: ");
        annual_rate = cin.nextDouble();
        monthly_rate = annual_rate / 1200.0;
        monthly_payment = loan * monthly_rate / (1 - 1 / Math.pow(1 + monthly_rate, years * 12));
        total = monthly_payment * years * 12;
        balance = loan;
        System.out.println("Loan Amount: " + (int)(loan*100)/100.0);
        System.out.println("Number of Years: " + years);
        System.out.println("Annual Interest Rate: " + annual_rate + "%");
        System.out.println("");
        System.out.println("Monthly Payment: " + (int)(monthly_payment*100)/100.0);
        System.out.println("Total Payment: " + (int)(total*100)/100.0);
        System.out.println("Payment#\tInterest\tPrincipal\tBalance\n");
        for (int i = 1; i <= years*12; i++) {
            principle = monthly_payment - (monthly_rate*balance);
            balance -= principle;
            interest = monthly_rate*balance;
            System.out.print(i + "\t\t" + (int)(interest*100)/100.0
                           + "\t\t" + (int)(principle*100)/100.0 + "\t\t" 
                           + (int)(balance*100)/100.0 + "\n");
        }
        
    }
}
