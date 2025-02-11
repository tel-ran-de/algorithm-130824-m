package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).

public class Anagram {
  
  public static void main(String[] args) {
        String strOne = "q1w2e13";
        String strTwo = "1q2w3e1";
        System.out.println(isAnagram(strOne, strTwo));
    }

    private static boolean isAnagram(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }

        HashMap<Character, Integer> characters = new HashMap<>();

        for (Character c : strOne.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

        for (Character c : strTwo.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) - 1);
        }

        return characters.values().stream().allMatch(c -> c == 0);
    }
}
