package org.telran.lecture_3_recursion;

public class ThirdPractice {
    public static void main(String[] args) {
        System.out.println("Iter = " + countConsonantIteration("Aleks"));
        System.out.println("Rec = " + countConsonantRecursion("Aleks", "Aleks".length()));
    }

    private static boolean isConsonant(char letter) {
        letter = Character.toUpperCase(letter);
        if (letter >= 65
                && letter <= 90
                && !(letter == 'A'
                || letter == 'E'
                || letter == 'I'
                || letter == 'O'
                || letter == 'U')) {
            return true;
        }
        return false;
    }

    public static int countConsonantIteration(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isConsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonantRecursion(String str, int n) {
        int res = 0;
        if (n == 1) {
            res = isConsonant(str.charAt(0)) ? 1 : 0;
            System.out.println("Now res = " + res);
            return res;
        }
        if (isConsonant(str.charAt(n - 1))) {
            res = countConsonantRecursion(str, n - 1) + 1;
            System.out.println("Now res = " + res);
            return res;
        } else {
            res = countConsonantRecursion(str, n - 1);
            System.out.println("Now res = " + res);
            return res;
        }
    }

}
