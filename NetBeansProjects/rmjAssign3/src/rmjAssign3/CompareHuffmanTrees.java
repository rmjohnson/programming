package rmjAssign3;

import java.util.Comparator;

/**
 * Class: Data Structures
 * Assignment: Assignment #3B
 * @author Ryan Johnson
 * Date of Last Modification: 10/17/2012
 * Description: This program takes in a series of words, entered in line by line.
 * Input is stopped once an empty line is entered. Each character is then taken
 * and then paired up with the number of times it shows up in the series of words.
 * The character and frequency are then stored in a HuffData object. The HuffData
 * is then stored in a Huffman Tree and encodings for each character are calculated
 * based off their position in the Huffman Tree.  The characters with their
 * frequencies, the characters with their encodings, the height of the Huffman
 * Tree, the number of unique characters, the shortest encoding, and the longest 
 * encoding are outputted to the console. After that, the user is able to input
 * encodings to be decoded according to the character encodings generated by
 * the Huffman Tree.
 */
public class CompareHuffmanTrees implements Comparator<BinaryTree<HuffData>> {

    //Compare method so when two trees are compared, they are compared by their weight
    @Override
    public int compare(BinaryTree<HuffData> treeLeft, BinaryTree<HuffData> treeRight) {
        int wLeft = treeLeft.getData().weight;
        int wRight = treeRight.getData().weight;
        return Integer.compare(wLeft, wRight);
    }

}
