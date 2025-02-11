package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив имен.
// Найдите самое длинное имя, если таких имен несколько - выведи любое их них

public class Names {
    public static void main(String[] args) {

        String[] names = {"Sebastjan","John", "Jan", "Benjamin", "Tonny",  "Aleksander"};
        System.out.println(findName(names));
    }

    public static String findName(String[] names) {
        String maxName = names[0];
        int maxLength = names[0].length();
        for (int i = 1; i < names.length; i++) {
            int length = names[i].length();
            if (length > maxLength) {
                maxLength = length;
                maxName = names[i];
            }
        }
        return maxName;
    }
}

