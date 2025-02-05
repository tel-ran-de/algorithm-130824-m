package org.telran.lecture_08_st_and_qu.examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoQueue {
    public static void main(String[] args) {
        // Создаем пустую очередь неограниченного размера - будет расширяться
        Deque<Integer> deque = new ArrayDeque<Integer>();

        // Добавляем элементы в конец очереди
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        // Смотрим что в очереди
        System.out.println(deque);

        // Извлекаем элементы из начала, пока очередь не пуста:
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }

        // Снова смотрим что в очереди
        System.out.println(deque);

        // Подробнее про Очередь: https://www.programiz.com/java-programming/arraydeque
    }
}
