package queue;

/**
 *
 * @author Ryan
 */
public interface IQueue<E> {
    void offer(E item);
    E poll();
    boolean isFull();
    boolean isEmpty();
}
