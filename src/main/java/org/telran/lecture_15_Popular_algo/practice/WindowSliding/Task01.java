package org.telran.lecture_15_Popular_algo.practice.WindowSliding;

// Дан массив целых чисел и число k.
// Найти максимальную сумму подмассива длины k.

public class Task01 {
    public static int findMaxSumSubarray(int[] arr, int k) {

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 3;
        int result = findMaxSumSubarray(arr, k);
        System.out.println("Max sum length" + k + ": " + result);
    }
}
}
