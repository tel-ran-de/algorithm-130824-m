package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив имен.
// Найдите самое длинное имя, если таких имен несколько - выведи любое их них

public class Names {
    public static void main(String[] args) {

        String[] names = {"Alex", "Konstantin", "Sergey", "Maxim"};

        String longestName = "";

        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }

        System.out.println("Longest name is - " + longestName);
    }
}
