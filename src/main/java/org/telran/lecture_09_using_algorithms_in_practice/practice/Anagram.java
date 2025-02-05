package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).

package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).

import java.util.Arrays;

public class Anagram {
    public static String wordOne = "Cod";
    public static String wordTwo = "Doc";

    public static void main(String[] args) {
        char[] one = wordOne.toLowerCase().toCharArray();
        char[] two = wordTwo.toLowerCase().toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one,two)){
            System.out.println("Строки являются анаграммами");
        }else {
            System.out.println("Ошибочка вышла");
        }
    }
}
