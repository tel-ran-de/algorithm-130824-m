package org.telran.lecture_13_bst.practice;

import lombok.Data;

@Data
public class Node {
    private int key;
    private String value;
    private int height;
    private Node left;
    private Node right;
}

