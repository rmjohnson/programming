package infixtopostfix;

/**
 *
 * @author Ryan
 */
public class InfixToPostfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Convert an infix expression to postfix
        //Scanner cin = new Scanner(System.in);
        String input = "5*(2+3)-8/4";
        for (char ch : input.toCharArray()) {
            if(isDigit(ch)) {
                System.out.println(ch);
            } else {
                
            }
        }
    }
}
