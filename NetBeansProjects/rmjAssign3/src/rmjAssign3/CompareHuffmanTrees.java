package rmjAssign3;

import java.util.Comparator;

/**
 *
 * @author Ryan
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
