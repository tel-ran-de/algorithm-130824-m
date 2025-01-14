package org.telran.lecture_12_trees.practice;

public class TreePractice {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(1, "node 1");
        bt.insert(2, "node 2");
        bt.insert(3, "node 3");
        bt.insert(4, "node 4");

        bt.print(bt.find(1));
    }
}

