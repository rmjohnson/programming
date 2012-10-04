/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

import java.util.Random;

/**
 *
 * @author Ryan
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Single_Link_List list = new Single_Link_List();
        Random gen = new Random();
        for (int i = 0; i < 10; i++) {
           list.insert(i);
        }
        System.out.println("List = " + list);
    }
}
