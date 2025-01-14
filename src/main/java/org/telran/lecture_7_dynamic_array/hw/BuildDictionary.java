package org.telran.lecture_7_dynamic_array.hw;

public class BuildDictionary {
    public static void main(String[] args) {
        buildDictionary("арфвыжаожровыы");
    }

    public static void buildDictionary(String text) {
        text = text.toLowerCase();

        int[] result = new int['я' - 'а' + 1];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                result[ch - 'а']++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }
    }
}
