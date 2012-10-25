package rmjAssign3;

import java.io.PrintStream;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Ryan
 */
public class HuffmanTree {
    private BinaryTree<HuffData> huffTree; //The huffman tree of type BinaryTree<HuffData>
    //An EncodeData array to store the encodings of all the characters
    private EncodeData[] encodings; 
    private int encodingsTop; //The top index of the EncodeData array
    
    //Build the Huffman Tree
    public void buildTree(HuffData[] symbols) {
        //Create a new priorityqueue of type BinaryTree<HuffData> the size of 
        //the number of symbols passed in
        Queue<BinaryTree<HuffData>> theQueue = new PriorityQueue<BinaryTree<HuffData>>(symbols.length, new CompareHuffmanTrees());
        //For each symbol in the symbols array
        for (HuffData nextSymbol : symbols) {
            //Create a new binary tree with the symbol
            BinaryTree<HuffData> aBinaryTree = new BinaryTree<HuffData>(nextSymbol, null, null);
            //Offer the new binary tree to the queue
            theQueue.offer(aBinaryTree);
        }
        //While there are still more than one items in the queue
        while(theQueue.size() > 1) {
            BinaryTree<HuffData> left = theQueue.poll(); //Take the top off the queue
            BinaryTree<HuffData> right = theQueue.poll(); //Take the new top off the queue
            int wl = left.getData().weight; //Get the weight of the left BinaryTree
            int wr = left.getData().weight; //Get the weight of the right BinaryTree
            //Create a new HuffData object with the weight as the sum of the left
            //and right and a null symbol
            HuffData sum = new HuffData(wl + wr, null); 
            //Create a new BinaryTree with the sum HuffData and the left and right
            //as the left and right children
            BinaryTree<HuffData> newTree = new BinaryTree<HuffData>(sum, left, right);
            //Offer the sum binarytree back to the queue
            theQueue.offer(newTree);
        }
        //Take the last item off the queue
        huffTree = theQueue.poll();
        
        //Initalize the EncodeData array to be the same length as the passed in symbols
        encodings = new EncodeData[symbols.length];
    }
    
    //A method used to print out all the encodings and store them to the EncodeData array
    public void printCode(PrintStream out, String code, BinaryTree<HuffData> tree) {
        HuffData theData = tree.getData(); //Get the data of the tree
        if (theData.symbol != null) { //If the data's symbol is not null (as in a symbol and not a sum)
            if(theData.symbol.equals(" ")) { //If the symbol is a space print out "space: "
                out.println("space: " + code);
            } else { //Otherwise print out the symbol and the code
                out.println(theData.symbol + " " + code);
                //Then add the symbol and code to the EncodeData table
                this.encodings[encodingsTop++] = new EncodeData(code, theData.symbol);
            }
        } else {
            //If the data's symbol is null, that means it is a sum node
            //and so it needs to go farther down the tree
            
            //Go down the left tree and add a 0
            printCode(out, code + "0", tree.getLeftSubtree());
            //Go down the right tree and add a 1
            printCode(out, code + "1", tree.getRightSubtree());
        }
    }
    
    //A method for decoding an inputed coded message
    public String decode(String codedMessage) {
        StringBuilder result = new StringBuilder(); //Create a new stringbuilder
        BinaryTree<HuffData> currentTree = huffTree; //Get the Huffman Tree
        for (int i = 0; i < codedMessage.length(); i++) { //Loop through the coded message
            //If the character is a 1, set currentTree to the right subtree
            if(codedMessage.charAt(i) == '1') { 
                currentTree = currentTree.getRightSubtree();
            } else { //If the character is a 0, set currentTree to the left subtree
                currentTree = currentTree.getLeftSubtree();
            }
            if(currentTree.isLeaf()) { //Once you hit a leaf
                HuffData theData = currentTree.getData(); //Get the data of the leaf
                result.append(theData.symbol); //Append the symbol to the stringbuilder
                currentTree = huffTree; //Reset the currentTree to be the entire tree
            }
        }
        //Return the string of the stringbuilder
        return result.toString();
    }

    public int getHeight() {
        //Run the getHeight method in BinaryTree and hide the parameters from the main
        return huffTree.getHeight(huffTree.root, 0); 
    }
    
    //A getter for the Huffman Tree
    public BinaryTree<HuffData> getHuffTree() {
        return huffTree;
    }
    
    //Get the shortest encoded character
    public String getShortestEncoding() {
        EncodeData shortest = encodings[0]; //Set shortest to the first encoding
        for (int i = 1; i < encodings.length; i++) { //Loop through the encodings
            //If the encoding at index is shorter than the shortest encoding's length
            if(shortest.encode.length() > encodings[i].encode.length()) {
                //Set shortest to the new encoding
                shortest = encodings[i];
            }
        }
        //Return the shortest's symbol and encoding
        return shortest.symbol + " = " + shortest.encode;
    }
    
    //Get the longest encoded character
    public String getLongestEncoding() {
        EncodeData longest = encodings[0]; //Set longest to the first encoding
        for (int i = 1; i < encodings.length; i++) { //Loop through the encodings
            //If the encoding at index is longer than the longest encoding's length
            if(longest.encode.length() < encodings[i].encode.length()) {
                //Set longest to the new encoding
                longest = encodings[i];
            }
        }
        //Return the longest's symbol and encoding
        return longest.symbol + " = " + longest.encode;
    }
}