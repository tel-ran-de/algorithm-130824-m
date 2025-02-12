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

public class Heights {
    public static void main(String[] args) {
        assert howManyBuildings(new int[]{8, 2, 3, 11, 11, 10}) == 2;
        assert howManyBuildings(new int[]{12, 20, 39, 45, 89}) == 5;
        assert howManyBuildings(new int[]{40, 20, 21, 22, 23, 24, 25}) == 1;
        assert howManyBuildings(new int[]{}) == 0;
        assert howManyBuildings(new int[]{1, 2, 2, 2, 1, 2}) == 2;
    }

    public static int howManyBuildings(int[] buildings) {
        return 0;
    }
}
