package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дан массив имен.
// Найдите самое длинное имя, если таких имен несколько - выведи любое их них

public class Names {
  
   public static void main(String[] args) {
        String[] names = {"Anna", "Alexandra", "Ivan", "Katarina"};

        String nameMax = names[0];
        for (int i = 0; i < names.length - 1; i++) {
            if (names[i + 1].length() > nameMax.length()) {
                nameMax = names[i + 1];
            }
        }
        System.out.println(nameMax);
    }
}
