package org.telran.lecture_14_hash.hw;
import java.util.HashMap;
import java.util.Map;
// Дан массив целых чисел.
// Найти первое вхождение элемента в массиве, который встречается ровно k раз.

// Функция находит первый элемент в массиве, который имеет частоту встречаемости, равную заданному числу k.
// Если такого элемента в массиве нет, функция возвращает -1.

public class Task02 {
    public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 0, 4, 6, 4, 10, 8};
        int k = 4;
        int result = firstElement(numbers, k);
        System.out.println(result);
    }

    public static int firstElement(Integer[] numbers, int k) {
        Map<Integer, Integer>frequency = new HashMap<>();
        for (Integer number : numbers) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }
        for (Integer number : numbers){
            if (frequency.get(number) == k) {
                return number;
            }
        }
        return -1;
    }
}
