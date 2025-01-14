package org.telran.lecture_13_bst.practice;

public class AvlPractice {
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();
        int[] keys = {10, 20, 30, 40, 50, 25};
        Node root = constructBST(tree, keys);

//        Util.print(tree.getRoot());
    }

    public static Node constructBST(AvlTree tree, int[] keys) {
        Node root = null;
        for (int key : keys) {
            root = tree.insert(root, key);
        }
        return root;
    }
}
