/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Ryan
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] names = {"Bethany","Paul","Gary","Micah","Ryan","Sarah","Plasma",
            "Tim","Jimmy","David","Mark","Isacc","Matthew"};
        MyQueue<String> queue = new MyQueue<>();
        for (int i = 0; i < names.length; i++) {
            queue.offer(names[i]);
        }
        
    }
}
