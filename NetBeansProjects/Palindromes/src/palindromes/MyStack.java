package palindromes;

import java.util.EmptyStackException;

/**
 *
 * @author Ryan
 */
public class MyStack<E> {
    private E[] list =  (E[])(new Object[100]);
    private int top = 0;
    
    public void push(E item) {
        if(!isFull())
            list[top++] = item;
    } 
    
    public E pop() throws EmptyStackException {
        if(!isEmpty())
            return list[--top];
        throw new EmptyStackException();
    }
    
    public Boolean isFull() {
        return top == list.length-1;
    }
    
    public Boolean isEmpty() {
        return top == 0;
    }
}
