package exercise11;

/**
 *
 * @author Ryan Johnson
 * A loan object.
 */
public class Loan {

    private double loanAmt;
    private double monthlyInterestRate;
    private int termInMonths;

    public Loan() {
        this(100, 8, 12);
    }

    public Loan(double loanAmt, double monthlyInterestRate, int termInMonths) {
        this.loanAmt = loanAmt;
        this.monthlyInterestRate = monthlyInterestRate;
        this.termInMonths = termInMonths;
    }

    public double getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public double getMonthlyPayment() {
        return loanAmt * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, termInMonths));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * termInMonths;
    }

    @Override
    public String toString() {
        return "Monthly Payment: " + getMonthlyPayment() + " Total Payment: "
                + getTotalPayment();
    }
}
