package dsa.trees.binarysearchtree;

public class Driver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertElement(10);
        bst.insertElement(15);
        bst.insertElement(19);
        bst.insertElement(17);
        bst.insertElement(6);
        bst.insertElement(8);
        bst.insertElement(6);
        bst.insertElement(11);
        bst.insertElement(2);
        bst.insertElement(0);
        bst.insertElement(130);
        System.out.println(bst.search(130));
        System.out.println(bst.search(11));
        bst.inorder();
    }
}
