package org.telran.lecture_14_hash.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Создание HashMap, где ключи и значения - строки
        Map<String, String> capitals = new HashMap<>();

        // Добавление элементов
        capitals.put("Russia", "Moscow");
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("USA", "Washington D.C.");

        // Получение значения по ключу
        String capitalOfFrance = capitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);

        // Проверка, содержит ли HashMap ключ
        boolean containsUSA = capitals.containsKey("USA");
        System.out.println("Contains USA key: " + containsUSA);

        // Перебор элементов HashMap
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Удаление элемента
        capitals.remove("Germany");
        System.out.println("After removing Germany: " + capitals);

        // Добавление null ключа и значения
        capitals.put(null, "nullValue");
        capitals.put("nullKey", null);
        System.out.println("HashMap with nulls: " + capitals);
    }
}