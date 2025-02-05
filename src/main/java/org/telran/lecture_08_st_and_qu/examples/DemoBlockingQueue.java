package org.telran.lecture_08_st_and_qu.examples;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DemoBlockingQueue {
    public static void main(String[] args) {
        // Создаем пустую очередь ограниченного размера
        BlockingQueue<Integer> deque = new ArrayBlockingQueue<Integer>(3);

        // Добавляем элементы в конец очереди
        deque.add(1);
        deque.add(2);
        deque.add(3);

        // Смотрим что в очереди
        System.out.println(deque);

        deque.add(4); // при попытке добавить еще один элемент - падаем с ошибкой

        // Подробнее про блокирующую Очередь: https://www.programiz.com/java-programming/blockingqueue
    }
}
