package rmjAssign3;

/**
 *
 * @author Ryan
 */
public class Node<E> {
    protected E data; //The data stored in the node
    protected Node<E> left; //Left child
    protected Node<E> right; //Right child

    public Node(E data) {
        this.data = data; //Set data from data parameter
        this.left = null; //Initialize the left child to null
        this.right = null; //Initialize the right child to null
    }

    @Override
    public String toString() {
        return data.toString(); //Return the data when toString is called
    }
}
