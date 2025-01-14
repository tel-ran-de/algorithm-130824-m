package org.telran.lecture_12_trees.hw;

public class Test {

    public static void main(String[] args) {
        int[] keys = {15, 10, 20, 8, 12, 16, 25};

        Node root = null;
        for (int key : keys) {
            root = MyTree.insert(root, key);
        }
        // поменять местами значения любых двух узлов
        MyTree.swapData(root.left, root.right.right);
        // исправить BST
        MyTree.correctBST(root);
        // распечатать BST после исправления
        MyTree.inorder(root);
    }
}
