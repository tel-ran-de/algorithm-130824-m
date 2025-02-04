package org.telran.lecture_04_d_and_c.hw;

import java.util.PriorityQueue;

public class TwoArrays {
    public static void main(String[] args) {

    }
    public static int getElementTwoSortedArrays(int[] arr1, int[] arr2, int index) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // Pushing elements for array arr1 to min-heap
        for (int element : arr1) {
            priorityQueue.offer(element);
        }
        // Pushing elements for array arr2 to min-heap
        for (int element : arr2) {
            priorityQueue.offer(element);
        }
        // Popping-out K-1 elements
        while (index-- > 1) {
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }
}
