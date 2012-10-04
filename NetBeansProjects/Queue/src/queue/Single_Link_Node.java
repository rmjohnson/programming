package queue;

/**
 * Simple single linked node class
 * @author Ryan
 */
public class Single_Link_Node<E> {
    private E data;
    private Single_Link_Node link;

    public Single_Link_Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Single_Link_Node getLink() {
        return link;
    }

    public void setLink(Single_Link_Node link) {
        this.link = link;
    }
    
}
