package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив положительных целых чисел.
// Найти максимально возможную сумму возрастающего подмассива.
// Подмассив определяется как непрерывная последовательность чисел в массиве.

// Пример 1:
//
// Input: nums = [10,20,30,5,10,50]
// Output: 65
// Пояснение: [5,10,50] — возрастающий подмассив с максимальной суммой 65.

// Пример 2:
//
// Input: nums = [10,20,30,40,50]
// Output: 150
// Пояснение: [10,20,30,40,50] — возрастающий подмассив с максимальной суммой 65.

public class MaxAscendingSum {
    public static void main(String[] args) {
        assert maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50}) == 65;
        assert maxAscendingSum(new int[]{60, 58, 55}) == 60;
        assert maxAscendingSum(new int[]{10, 20, 30, 40, 50}) == 150;
        assert maxAscendingSum(new int[]{}) == 0;
        assert maxAscendingSum(new int[]{1, 2, 3, 1, 2, 3, 1, 2}) == 6;
        assert maxAscendingSum(new int[]{30, 0, 5, 10, 9, 10, 10}) == 30;
        assert maxAscendingSum(new int[]{20, 20, 20, 20}) == 20;
    }

    public static int maxAscendingSum(int[] arr) {
        return 0;
    }
}
