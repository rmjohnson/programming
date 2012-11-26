/*
 * This program will display an increasing large value briefly and
 * the player will repeat the value. If the response 
 * is correct, then a larger value will be shown.
 */
package doublesimon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan Johnson
 */
public class DoubleSimon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        double value;
        int places;
        boolean response_Correct = true;
        // introduce the game
        display_Introduction();
        value = initialize_Game();
        places = 1;
        do{   
        // A. display the value for a short time
            display_Value(value, places);
        
        // get the player response
        // check the response
        // if correct, increase the length of value and go to A
        } while(response_Correct);
        // report the result
    }
    /**
     * Display the number to be repeated for a couple of
     * seconds.
     * @param value
     * @param places 
     */
    static void display_Value(double value, int places) throws InterruptedException{
        long temp = (long)(value * Math.pow(10,places));
        JFrame f1 = new JFrame("Number to Repeat");
        JLabel jl = new JLabel("          Number: " + temp + "    ");
        f1.add(jl);
        f1.pack();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        Thread.sleep(2000);
        f1.dispose();
    }
    
    /**
     * Generate the value to be repeated.
     * @return double 
     */
    static double initialize_Game(){
        double temp = Math.random();
        while((long)(temp*1000000000) == temp*1000000000){
            temp = Math.random();
        }
        return temp;
    }
    
    /**
     * Introduce the player to the game.
     */
    static void display_Introduction(){
        JOptionPane.showMessageDialog(null, 
                "A number will be displayed for 2 seconds.\n"
                + "Enter the number.\n"
                + "If entere correctly, \n"
                + "a longer value will be given.");
    }
}
