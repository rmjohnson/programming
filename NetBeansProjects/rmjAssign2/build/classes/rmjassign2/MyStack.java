package rmjassign2;

import java.util.EmptyStackException;

/**
 *
 * @author Ryan
 * A simple stack for storing objects of any type.
 */
public class MyStack<E> {

    private E[] list = (E[]) (new Object[10000]); //An array to store the data
    private int top = 0; //The current top of the stack

    public void push(E item) {
        if (!isFull()) {
            this.list[top++] = item; //Put something on to the list and increment the top
        }
    }

    public E pop() throws EmptyStackException {
        if (!isEmpty()) {
            return list[--top]; //Return what is on top of the stack and decrement the top
        }
        throw new EmptyStackException();
    }

    public Boolean isFull() {
        return top == list.length - 1; //Check if the list is full
    }

    public Boolean isEmpty() {
        return top == 0; //Check if the stack is empty
    }
    
}
