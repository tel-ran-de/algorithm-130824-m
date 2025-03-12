package org.telran.lecture_14_hash.practice.tasks;

import java.util.Map;
import java.util.HashMap;

// Задача: Дан массив элементов.
// Нужно подсчитать, сколько раз встречается каждый элемент.

public class Task01 {
    public static Map<Integer, Integer> countElementFrequency(Integer[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // Создаем HashMap для хранения частот
        // You code here ...
        return frequencyMap;
    }

    public static void main(String[] args) {
        Integer[] elements = {3, 1, 4, 2, 4, 3, 4, 2, 3, 4, 5, 6};
        Map<Integer, Integer> frequencies = countElementFrequency(elements);

        // Вывод результатов
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println("Элемент " + entry.getKey() + " встречается " + entry.getValue() + " раз(а).");
        }
    }
}
