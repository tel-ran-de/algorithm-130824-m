package org.telran.lecture_06_quick.practice1;

import java.util.Arrays;
import java.util.Comparator;

// "Сумма наибольших по модулю"
// Дан массив чисел.
// Найти: сумму 5-ти самых больших элементов по модулю.
// Пояснение: сравниваем элементы по модулю, а в сумму добавляем сами значения элементов(без модуля)
// В примере ниже, два самых больших по модулю числа это: -224 и 211. Они самые большие по модулю, а их сумма = -13

public class Task05 {
    public static void main(String[] args) {
        Integer[] numbers = {-25, 136, -13, -224, -128, -67, 128, -21, 4, 211, 0};
        Arrays.sort(numbers, Comparator.comparing(Math::abs, Comparator.reverseOrder()));

        System.out.println(Arrays.toString(numbers));

    }
}
