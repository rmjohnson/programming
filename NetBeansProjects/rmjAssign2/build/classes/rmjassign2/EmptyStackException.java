/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rmjassign2;

/**
 *
 * @author Ryan
 */
public class EmptyStackException extends Exception {

    /**
     * Creates a new instance of
     * <code>EmptyStackException</code> without detail message.
     */
    public EmptyStackException() {
    }

    /**
     * Constructs an instance of
     * <code>EmptyStackException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyStackException(String msg) {
        super(msg);
    }
}
