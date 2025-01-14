package org.telran.lecture_13_bst.practice;

public class Util {

    // A utility function to get the height of the tree
    public static int getHeightNode(Node node) {
        if (node == null)
            return 0;

        return node.getHeight();
    }

    // A utility function to get maximum of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // A utility function to right rotate
    public static Node rightRotate(Node b) {
        Node c = b.getLeft();
        Node temp = c.getRight();

        // Perform rotation
        c.setRight(b);
        b.setLeft(temp);

        // Update heights
        b.setHeight(max(getHeightNode(b.getLeft()), getHeightNode(b.getRight())) + 1);
        c.setHeight(max(getHeightNode(c.getLeft()), getHeightNode(c.getRight())) + 1);

        // Return new root
        return c;
    }

    // A utility function to left rotate subtree rooted with x
    public static Node leftRotate(Node a) {
        Node b = a.getRight();
        Node temp = b.getLeft();

        // Perform rotation
        b.setLeft(a);
        a.setRight(temp);

        //  Update heights
        a.setHeight(max(getHeightNode(a.getLeft()), getHeightNode(a.getRight())) + 1);
        b.setHeight(max(getHeightNode(b.getLeft()), getHeightNode(b.getRight())) + 1);

        // Return new root
        return b;
    }

    // Get Balance factor of node N
    public static int getBalanceFactor(Node node) {
        if (node == null)
            return 0;

        return getHeightNode(node.getLeft()) - getHeightNode(node.getRight());
    }
}
