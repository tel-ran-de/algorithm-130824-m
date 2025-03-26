package org.telran.lecture_11_greedy_practice.practice.backpack;

// Есть набор предметов, у каждого предмета есть: цена и вес.
// Требуется выбрать из заданного набора предметов наиболее ценные, которые поместятся в рюкзак заданной вместимости.

// Алгоритм
// 1. Рассчитываем удельную ценность для каждого предмета.
// 2. Сортируем предметы по убыванию удельной ценности.
// 3. Складываем предметы в рюкзак(массив), по суммарный вес не превысит максимально допустимый

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backpack {
    public static void main(String[] args) {
        // Исходный набор предметов (название, вес, цена)
        Item[] items = new Item[]{
                new Item("Laptop", 3, 20),   // Дорогой, но лёгкий
                new Item("Gold Bar", 5, 50), // Очень дорогой, но тяжёлый
                new Item("Book", 2, 5),      // Дешёвый, лёгкий
                new Item("Phone", 1, 10),    // Лёгкий, но дорогой
                new Item("Water Bottle", 4, 8), // Тяжеловатый, средняя ценность
                new Item("Headphones", 1, 7), // Лёгкие, ценные
                new Item("Tent", 6, 15)      // Тяжёлый, но полезный
        };

        int totalWeight = 10; // Максимальная вместимость рюкзака

        // 1. Рассчитываем удельную ценность и сортируем по убыванию удельной ценности (цена / вес)
        Arrays.sort(items, (a, b) -> Double.compare(b.unit_value, a.unit_value));

        // 2. Складываем предметы в рюкзак (учитываем лимит веса)
        List<Item> selectedItems = new ArrayList<>();
        int currentWeight = 0; // Текущий вес рюкзака
        double totalValue = 0; // Общая ценность выбранных предметов

        for (Item item : items) {
            if (currentWeight + item.weight <= totalWeight) {
                // Если предмет влезает полностью, добавляем его
                selectedItems.add(item);
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // Если предмет не влезает, выходим из цикла (жадный алгоритм)
                break;
            }
        }

        // 3. Выводим результат
        System.out.println("Отобранные предметы:");
        for (Item item : selectedItems) {
            System.out.println(item);
        }
        System.out.println("Общая ценность: " + totalValue);
    }
}

