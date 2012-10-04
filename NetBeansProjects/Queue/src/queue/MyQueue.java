package queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ryan
 */
public class MyQueue<E> implements IQueue<E> {

    Single_Link_Node<E> head, tail;

    @Override
    public void offer(E data) {
        Single_Link_Node<E> node = new Single_Link_Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setLink(node);
            tail = node;
        }
    }

    @Override
    public E poll() {
        E data = null;
        if(head==null) {
            try {
                throw new EmptyQueueException();
            } catch (EmptyQueueException ex) {
                Logger.getLogger(MyQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            data = head.getData();
            head = head.getLink();
            if(head==null)
                tail = null;
        }
        return data;
    }
    
    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean isEmpty() {
        return head==null;
    }
}
