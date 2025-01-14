package org.telran.lecture_9_linked.practice;

import org.telran.lecture_9_linked.MyLinkedList;
import org.telran.lecture_9_linked.Node;

import java.util.HashSet;

public class DetectorLoopLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.pushToTail(5);
        list.pushToTail(4);
        list.pushToTail(25);
        list.pushToTail(20);
        list.pushToTail(35);
        list.pushToTail(100);
        list.pushToTail(10);

        /* Create loop for testing */
        Node next = list.getHead().getNext().getNext().getNext().getNext().getNext().getNext();
        System.out.println(next.getData()); // tail 10
        next.setNext(list.getHead().getNext().getNext()); // third node from head
        System.out.println(next.getNext().getData()); // 25


        if (detectLoop(list.getHead()))
            System.out.println("Loop found");
        else
            System.out.println("No loop");
    }

    static boolean detectLoop(Node head) {
        HashSet<Node> set = new HashSet<>();
        while (head != null) {
            // If we have already has this node in hashmap it means there is a cycle
            if (set.contains(head)) {
                return true;
            }
            // If we are seeing the node for the first time, insert it in hash
            set.add(head);
            head = head.getNext();
        }
        return false;
    }
}
