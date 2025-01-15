package org.telran.lecture_6_quick.practice1;

import org.telran.lecture_6_quick.algo.QuickSort;
import java.util.Arrays;

// "Простая сортировка"
// Дан массив произвольных целых чисел
// Используя любой алгоритм сортировки из lecture_6, отсортируйте элементы в порядке возрастания.


public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, -5, 0, 7, 12, 0, -4, 10};
        QuickSort.quickSortRecursive(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }
}
