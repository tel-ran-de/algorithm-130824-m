package org.telran.lecture_14_hash.examples;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
    public static void main(String[] args) {
        // Создание Hashtable, где ключи и значения - строки
        Hashtable<String, String> capitals = new Hashtable<>();

        // Добавление элементов
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("USA", "Washington D.C.");

        // Получение значения по ключу
        String capitalOfFrance = capitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);

        // Проверка, содержит ли Hashtable ключ
        boolean containsUSA = capitals.containsKey("USA");
        System.out.println("Contains USA key: " + containsUSA);

        // Перебор элементов Hashtable
        Enumeration<String> keys = capitals.keys();
        while (keys.hasMoreElements()) {
            String country = keys.nextElement();
            String capital = capitals.get(country);
            System.out.println(country + ": " + capital);
        }

        // Удаление элемента
        capitals.remove("Germany");
        System.out.println("After removing Germany: " + capitals);

        // Попытка добавления null ключа или значения приведет к исключению
        // capitals.put(null, "nullValue"); // Вызовет NullPointerException
        // capitals.put("nullKey", null); // Вызовет NullPointerException
    }
}