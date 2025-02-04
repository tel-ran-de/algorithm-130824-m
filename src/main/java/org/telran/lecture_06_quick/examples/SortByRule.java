package org.telran.lecture_06_quick.examples;

import java.util.Arrays;
import java.util.Comparator;

public class SortByRule {
    public static void main(String[] args) {
        Integer[] numbers = {2, 4, -8, -5, 0, 7, 12, -4, 10};
        // Сортируем массив Integer по абсолютному значению в возрастающем порядке
        Arrays.sort(numbers, Comparator.comparing(Math::abs));
        System.out.println(Arrays.toString(numbers));

        // Сортируем массив Integer по абсолютному значению в убывающем порядке
        Arrays.sort(numbers, Comparator.comparing(Math::abs, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(numbers));
    }
}