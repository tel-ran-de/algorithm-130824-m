package org.telran.lecture_4_d_and_c.practice.max_element;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        System.out.println(getMaxElement(arr, 0, arr.length - 1));
    }

    public static int getMaxElement(int[] arr, int low, int high) {

        if (low == high) {
            return arr[low];
        }

        if (high - low == 1) {
            if (arr[low] >= arr[high]) {
                return arr[low];
            } else {
                return arr[high];
            }
        }

        int mid = (low + high) / 2;

        if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return arr[mid];
        }

        if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
            return getMaxElement(arr, low, mid - 1);
        } else {
            return getMaxElement(arr, mid + 1, high);
        }
    }
}
