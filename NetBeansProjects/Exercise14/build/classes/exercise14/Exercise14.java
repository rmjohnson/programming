package exercise14;

/**
 * Class: Computer Science II
 * Assignment: Exercise 14.20
 * @author Ryan Johnson
 * Date of Last Modification: 3/18/2012
 * Description: This program takes in 2 rational numbers and an operator and
 * uses the Rational class to calculate the answer using the two operands and the
 * operator.
 */
public class Exercise14 {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Please enter it in the format operand operator operand.");
        }
        
        String num1 = args[0];
        String operator = args[1];
        String num2 = args[2];
        String answer = "";
              
        Rational rNum1 = new Rational(Integer.parseInt(num1.split("/")[0]),Integer.parseInt(num1.split("/")[1]));
        Rational rNum2 = new Rational(Integer.parseInt(num2.split("/")[0]),Integer.parseInt(num2.split("/")[1]));
        
        switch(operator) {
            case "+":
                answer = rNum1.add(rNum2).toString();
                break;
            case "-":
                answer = rNum1.subtract(rNum2).toString();
                break;
            case "x":
                answer = rNum1.multiply(rNum2).toString();
                break;
            case "/":
                answer = rNum1.divide(rNum2).toString();
                break;
        }
        
        System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
    }
}
