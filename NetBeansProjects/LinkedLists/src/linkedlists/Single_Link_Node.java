package linkedlists;

/**
 * Simple single linked node class
 * @author Ryan
 */
public class Single_Link_Node {
    private int data;
    private Single_Link_Node link;

    public Single_Link_Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Single_Link_Node getLink() {
        return link;
    }

    public void setLink(Single_Link_Node link) {
        this.link = link;
    }
    
}
