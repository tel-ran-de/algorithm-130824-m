package org.telran.lecture_4_d_and_c.practice.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 8, 98, 22};
        int key = 22;
        Arrays.sort(array); // condition for binary search - sorted array
        System.out.println(Arrays.toString(array));

        // calling a method and outputting the result to the console
        binarySearch(array, array.length, key);
    }

    /**
     * @param array  initialed array
     * @param length the size of the given array
     * @param key    search element
     */
    public static void binarySearch(int[] array, int length, int key) {
        int position;
        int comparisonCount = 1; // to count the number of comparisons
        int first = 0; // start index
        int last = length - 1; // end index

        // find the index of the middle element of the array
        position = (first + last) / 2;

        if (array[position] == key) {
            System.out.println("The key was found: position into array is " + position);
            return;
        }

        while ((array[position] != key) && (first <= last)) {
            comparisonCount++;
            if (array[position] > key) { // the number at the position is less than the given one
                last = position - 1; // true: move to the left
            } else {
                first = position + 1; // false: move right
            }
            position = (first + last) / 2; // looking for the middle
        }

        if (first <= last) {
            System.out.println("The key was found: position into array is " + position);
        } else {
            System.out.println("The key wasn't found: count comparison");
        }
        System.out.println("count: " + comparisonCount);
    }
}
