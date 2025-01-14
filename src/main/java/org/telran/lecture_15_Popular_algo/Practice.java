package org.telran.lecture_15_Popular_algo;

public class Practice {

    public static int maxSumSlidingWindow(int[] arr, int k) {
        int length = arr.length;
        if (length < k) {
            System.out.println("wrong size of array");
            return -1;
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        int windowSum = max;
        for (int i = k; i < length; i++) {
            windowSum += arr[i] - arr[i - k];
            max = Math.max(max, windowSum);
        }
        return max;
    }
}
