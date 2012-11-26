/*
 * Method examples using addition.
 */
package methodexamples;

/**
 *
 * @author Ryan Johnson
 */
public class MethodExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5,y = 8, z = 27, a = 15, b = 3, c=86;
        double w = 5.3, v = 9.2;
        System.out.println("The sum of x + y is "  + sum(x,y));
        System.out.println("The sum of w + v is " + sum(w,v));
        System.out.println("The sum of x + y + z is " + sum(x,y,z));
        System.out.println("The sum of all the integers is " + 
                sum(x,y,z,a,b,c));
        System.out.println("The minimum value is " + min(x,y,z,a,b,c));
    }

    public static int min(int ... number){
        int min = number[0];
        for (int i : number) {
            if(i < min)
                min = i;
        }
        return min;
    }
    
    public static int sum(int ... number){
        int j = 0;
        for (int i = 0; i < number.length; i++) {
            j += number[i];
        }
        return j;
    }
    
    public static double sum(double a, double b){
        return a + b;
    }
    
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    
    public static int sum(int a, int b){
        return a + b;
    }
}
