package org.telran.lecture_08_st_and_qu.examples;

import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Добавление элементов на вершину стека
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Извлечение элемента с вершины стека
        int topElement = stack.pop();
        System.out.println("Извлеченный элемент: " + topElement); // Выведет: 30

        System.out.println("Стек после извлечения: " + stack); // Выведет: [10, 20]

        // Проверка, пустой ли стек
        boolean isEmpty = stack.empty();
        System.out.println("Стек пустой? " + isEmpty); // Выведет: false

        // Получение элемента с вершины стека без удаления
        int peekElement = stack.peek();
        System.out.println("Верхний элемент: " + peekElement); // Выведет: 20
    }
}
