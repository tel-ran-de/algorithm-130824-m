package org.telran.lecture_09_using_algorithms_in_practice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumWords {
    public static void main(String[] args) {
        String word = "AbraCadabra";

        // Приводим к нижнему регистру, чтобы a и A считались одинаковыми
        word = word.toLowerCase();

        // Создаём массив из 26 элементов (для букв a-z)
        int[] counts = new int[26];

        // Проходим по строке и считаем буквы
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Убеждаемся, что символ - буква
                counts[c - 'a']++; // Увеличиваем счётчик для соответствующей буквы
            }
        }

        // Выводим буквы и их количество
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) { // Выводим только те буквы, которые встречались
                System.out.println((char) (i + 'a') + " - " + counts[i]);
            }
        }
    }
}
