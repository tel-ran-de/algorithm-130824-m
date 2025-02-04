package org.telran.lecture_06_quick.hw;

import org.telran.lecture_06_quick.algo.QuickSort;

import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4, 2, 6, 9, 2};

        QuickSortIterative.quickSortIterative(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

        arr = new int[] {4, 2, 6, 9, 2};
        QuickSort.quickSortRecursive(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}
