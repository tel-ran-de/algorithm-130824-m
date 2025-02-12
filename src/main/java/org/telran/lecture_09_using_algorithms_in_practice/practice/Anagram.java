package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).

public class Anagram {
    public static void main(String[] args) {
        String str1 = "asdfg";
        String str2 = "gfDsa";

        if (areAnagram(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
