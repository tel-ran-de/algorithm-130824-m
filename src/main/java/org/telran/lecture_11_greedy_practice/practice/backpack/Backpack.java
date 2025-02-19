package org.telran.lecture_11_greedy_practice.practice.backpack;

// Есть набор предметов, у каждого предмета есть: цена и вес.
// Требуется выбрать из заданного набора предметов наиболее ценные, которые поместятся в рюкзак заданной вместимости.

// Алгоритм
// 1. Рассчитываем удельную ценность для каждого предмета.
// 2. Сортируем предметы по убыванию удельной ценности.
// 3. Складываем предметы в рюкзак(массив), по суммарный вес не превысит максимально допустимый

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Backpack {
    public static void main(String[] args) {
        Item[] items = new Item[]{ // Исходный набор предметов
                new Item("Серебро", 8, 60),
                new Item("Броня", 20, 1120),
                new Item("Книга", 1, 10),
                new Item("Часы", 2, 40),
        };
        int totalWeight = 10; // Максимальная вместимость рюкзака

        Arrays.sort(items, Comparator
                .comparingDouble((Item a) -> a.getUnitValue()).reversed()
                .thenComparing((Item::getWeight)));
        print(items);

        List<Item> backpack = new ArrayList<>();
        int sum = 0;

        for (Item item : items) {
            if ((item.getWeight() + sum) <= totalWeight) {
                backpack.add(item);
                sum += item.getWeight();
            }

        }
        System.out.println("-----------------------------");
        backpack.forEach(System.out::println);
    }

    public static void print(Item[] items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
