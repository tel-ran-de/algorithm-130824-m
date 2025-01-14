package org.telran.lecture_1_intro;

import java.util.Arrays;

public class ArrayStr {
    public static void main(String[] args) {
        String[] arr = {"Aleks", "Thea", "Thomas", "Sergey", "Azriel"};
        System.out.println("sum = " + Arrays.toString(getNames(arr)));
    }

    private static String[] getNames(String[] arr) {
        String[] names = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            names[i] = arr[i];
        }
        return names;
    }
}
