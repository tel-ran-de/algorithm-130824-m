package org.telran.lecture_15_Popular_algo.practice.TwoPointers;

// Дан отсортированный массив целых чисел и число target.
// Найти два числа в массиве, сумма которых равна target.

public class Task04 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;

        findTwoSum(arr, target);
    }

    public static void findTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Найдены числа: " + arr[left] + " и " + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Пара чисел с суммой " + target + " не найдена.");
    }
}
