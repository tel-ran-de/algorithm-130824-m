package org.telran.lecture_11_greedy_practice.practice.backpack;

// Есть набор предметов, у каждого предмета есть: цена и вес.
// Требуется выбрать из заданного набора предметов наиболее ценные, которые поместятся в рюкзак заданной вместимости.

// Алгоритм
// 1. Рассчитываем удельную ценность для каждого предмета.
// 2. Сортируем предметы по убыванию удельной ценности.
// 3. Складываем предметы в рюкзак(массив), по суммарный вес не превысит максимально допустимый

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Backpack {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Phone", 1, 100));
        items.add(new Item("Power bank", 2, 50));
        items.add(new Item("Macbook", 5, 70));
        items.add(new Item("Watermelon", 8, 20));
        items.add(new Item("Water", 2, 50));
        items.add(new Item("Snacks", 1, 60));
        items.add(new Item("Medicine", 1, 200));
        System.out.println(items);

        int totalWeight = 10; // Максимальная вместимость рюкзака

        List<Item> fulledBackpack = fullBackpack(items, totalWeight);
        System.out.println(fulledBackpack);
    }

    public static List<Item> fullBackpack(List<Item> items, int totalWeight) {
        ArrayList<Item> sorted = items.stream()
                .sorted(Comparator.comparing(Item::getUnit_value).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

        List<Item> result = new ArrayList<>();
        int currentWeight = 0;

        for (Item item : sorted) {
            if (totalWeight > currentWeight + item.getWeight()) {
                currentWeight += item.getWeight();
                result.add(item);
            }
        }

        return result;
    }
}
