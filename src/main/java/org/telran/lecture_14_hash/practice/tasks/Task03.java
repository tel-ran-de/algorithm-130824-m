package org.telran.lecture_14_hash.practice.tasks;

import java.util.List;
import java.util.ArrayList;

// Задача: Дан массив строк, нужно найти все группы анаграмм (строк, состоящих из одних и тех же букв).

public class Task03 {

    public static List<List<String>> groupAnagrams(String[] words) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagramGroups = groupAnagrams(words);
        System.out.println(anagramGroups);
    }
}