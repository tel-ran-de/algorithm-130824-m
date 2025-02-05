package org.telran.lecture_07_dynamic_array.examples;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        // 1. Создание
        ArrayList<Integer> arrayList = new ArrayList<>(); // создание пустого ArrayList целых чисел
        ArrayList<String> stringList = new ArrayList<>(10); // создание ArrayList строк с начальной емкостью 10

        // 2. Добавление
        arrayList.add(10); // добавление элемента в конец списка
        arrayList.add(0, 5); // добавление элемента 5 на позицию 0

        // 3. Удаление
        arrayList.remove(0); // удаление элемента с позиции 0
        arrayList.remove(Integer.valueOf(10)); // удаление элемента, равного 10

        // 4. Получение элементов
        int first_element = arrayList.get(0); // получение элемента по индексу

        // 5. Замена элемента
        arrayList.set(0, 100); // Запись 100 на позицию с индексом 0

        // 6. Перебор элементов
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // 6.1. Перебор элементов (компактная версия)
        for (Integer element : arrayList) {
            System.out.println(element);
        }

        // Все методы ArrayList: https://www.programiz.com/java-programming/library/arraylist
    }
}
