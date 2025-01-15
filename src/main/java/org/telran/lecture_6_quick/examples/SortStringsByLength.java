package org.telran.lecture_6_quick.examples;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsByLength {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "orange", "grape", ""};

        System.out.println("Исходный массив: " + Arrays.toString(strings));

        // Сортировка по возрастанию длины
        Arrays.sort(strings, Comparator.comparing(String::length));
        System.out.println("Сортировка по возрастанию длины: " + Arrays.toString(strings));

        // Сортировка по убыванию длины
        Arrays.sort(strings, Comparator.comparing(String::length, Comparator.reverseOrder()));
        System.out.println("Сортировка по убыванию длины: " + Arrays.toString(strings));
    }
}