package linkedlists;

/**
 *
 * @author Ryan
 */
public class Single_Link_List {

    private Single_Link_Node head;

    public Single_Link_List() {
        
    }

    public void insert(int data) {
        Single_Link_Node temp = new Single_Link_Node(data);
        if (head != null) {
            temp.setLink(head);
            head = temp;
        } else {
            head = temp;
        }
    }

    @Override
    public String toString() {
        String output = "";
        Single_Link_Node next = head;
        while(next != null) {
            output += next.getData() + " ";
            next = next.getLink();
        }
        return output;
    }
    
}
