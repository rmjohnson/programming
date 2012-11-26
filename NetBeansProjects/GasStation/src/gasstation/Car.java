/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gasstation;

/**
 *
 * @author Ryan
 */
public class Car {
    int[] loc = new int[2];
    String color;
    int fuelRemaining;

    public Car(String color, int fuelRemaining) {
        this.color = color;
        this.fuelRemaining = fuelRemaining;
    }
    
    
}
