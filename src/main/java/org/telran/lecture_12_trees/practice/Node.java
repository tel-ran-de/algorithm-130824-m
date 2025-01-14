package org.telran.lecture_12_trees.practice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private int key;
    private String value;
    Node left;
    Node right;


    public void printNode() {
        System.out.println(value);
    }
}
