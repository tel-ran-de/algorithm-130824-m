package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word please");
        String firstWord = scanner.next();

        System.out.println("Enter second word please");
        String secondWord = scanner.next();

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        char[] word1 = firstWord.toCharArray();
        char[] word2 = secondWord.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        System.out.println(word1);
        System.out.println(word2);

        if (Arrays.equals(word1, word2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
