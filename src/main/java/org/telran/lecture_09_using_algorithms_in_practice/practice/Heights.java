package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив целых чисел размера n.
// Элементы массива – это высоты некоторых сооружений.
// Необходимо определить сколько таких сооружений, можно увидеть из начальной точки 0.

// Пример 1:
// Input: [8, 2, 3, 11, 11, 10]
// Output: 2
// Пояснение: Нам видно первое здание высотой 8, за ним следуют 11 (2 и 3 не видно, так как они меньше 8),
//    последние два элемента (11 и 10) также не видны так как 11 находится на том же уровне, что и 4 элемент (тоже 11),
//    а 10 – еще ниже.

// Пример 2:
// Input: [12, 20, 39, 45, 89]
// Output: 5
// Пояснение: будут видны все элементы, так как они расположены по возрастанию

import java.util.Arrays;
import java.util.Scanner;

public class Heights {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество зданий: ");
        int n = scanner.nextInt();
        int[] buildings = new int[n];
        System.out.println("Введите высоту зданий в этажах по мере удаления: ");
        for (int i = 0; i < n; i++) {
            int height;
            do {
                System.out.println("Enter height of building N:" + (i + 1) + " (Положительное число): ");
                height = scanner.nextInt();
            } while (height < 1);
            buildings[i] = height;
        }
        System.out.println("Your district:" + Arrays.toString(buildings));

        int visibleCount = 0;
        int maxHeight = 0;
        for (int building : buildings) {
            if (building > maxHeight) {
                visibleCount++;
                maxHeight = building;
            }
        }
        System.out.println("Количество видимых зданий: " + visibleCount);
    }
}

