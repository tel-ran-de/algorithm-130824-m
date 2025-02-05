package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив имен.
// Найдите самое длинное имя, если таких имен несколько - выведи любое их них

public class Names {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Max",
                "Evnegiy",
                "Anastasiya"
        );

        String longestName = "";

        for (String n : names) {
            if (n.length() > longestName.length()) {
                longestName = n;
            }
        }

        System.out.println("Longest name is - " + longestName);
    }
}
