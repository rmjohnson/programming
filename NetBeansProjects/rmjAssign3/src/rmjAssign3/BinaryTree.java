package rmjAssign3;

/**
 *
 * @author Ryan
 */
public class BinaryTree<E> {
    protected Node<E> root; //The root of the tree, of node type
    
    //No parameter constructor creates an empty tree, setting the root to null
    public BinaryTree() { 
        root = null;
    }

    //Single parameter constructor takes in a node and sets it to the root
    public BinaryTree(Node<E> root) {
        this.root = root;
    }
    
    //Multiple parameter constructor takes in data and a left and right tree
    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        root = new Node(data); //Create a new node with the passed in data
        //If the leftTree parameter isn't null, set the root's left to the
        //passed in left tree, otherwise set it to null
        if (leftTree != null) { 
            root.left = leftTree.root;
        } else {
            root.left = null;
        }
        //If the rightTree parameter isn't null, set the root's right to the
        //passed in right tree, otherwise set it to null
        if(rightTree != null) {
            root.right = rightTree.root;
        } else {
            root.right = null;
        }
    }
    
    //A method to get the leftSubtree of the current BinaryTree
    public BinaryTree<E> getLeftSubtree() {
        //If the root and the root's left aren't null
        if (root != null && root.left != null) {
            //Create a new binary tree with the root's left and return it
            return new BinaryTree<E>(root.left);
        } else { //Otherwise return an empty BinaryTree
            return new BinaryTree<E>(null);
        }
    }
    
    //A method to get the rightSubtree of the current BinaryTree
    public BinaryTree<E> getRightSubtree() {
        //If the root and the root's right aren't null
        if (root != null && root.right != null) {
            return new BinaryTree<E>(root.right);
        } else { //Otherwise return an empty BinaryTree
            return new BinaryTree<E>(null);
        }
    }
    
    //Method to find out if the current tree is a leaf
    public boolean isLeaf() {
        //If the root is null or it has no children, return true
        return root == null || (root.left == null && root.right == null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //Create a new StringBuilder
        preOrderTraverse(root, 1, sb); //Run the preOrderTraverse method
        return sb.toString(); //Output the result of the preOrderTraverse
    }
    
    //A method to go around the tree using preOrder traversal
    private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
        //Add spaces for how deep the node is
        for (int i = 0; i < depth; i++) {
            sb.append(" ");
        }
        //If the node is null, return "null"
        if(node == null) {
            sb.append("null\n");
        } else {
            //Otherwise get the data of the node and then recursively call the 
            //method on the node's children and add one to the depth
            sb.append(node.toString());
            sb.append("\n");
            preOrderTraverse(node.left,depth+1,sb);
            preOrderTraverse(node.right,depth+1,sb);
        }
    }
    
    //A method to find the height of the tree
    public int getHeight(Node<E> node, int height) {
        if(node == null) { //If there aren't any more nodes
            return height-1; //Return height-1 to fix off by one error (oops)
        } else {
            height++; //Increment the height
            //If the left subtree has a greater height, return that
            if(getHeight(node.left,height) > getHeight(node.right,height)) {
                return getHeight(node.left,height);
            } else { //Otherwise return the height of the right subtree
                return getHeight(node.right,height);
            }
        }
    }

    //Method to get the data of the root
    public E getData() {
        return root.data;
    }
    
}