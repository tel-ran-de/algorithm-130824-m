package org.telran.lecture_15_Popular_algo.practice.WindowSliding;

// Дан массив целых чисел и число k.
// Найти максимальную сумму подмассива длины k.

public class Task01 {
    public static void main(String[] args) {
        int[] arr = {15, 12, 4, 2, 6, 34, 12};
        int k = 4;
        System.out.println(findMaxSum(k, arr));
    }

    private static int findMaxSum(int k, int[] arr) {
        int left = 0;
        int right = k;
        int maxSum = 0;

        while (right <= arr.length) {
            int sum = 0;
            for (int i = left; i < right; i++) {
                sum += arr[i];
            }
            left++;
            right++;
//            System.out.println(sum);

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
