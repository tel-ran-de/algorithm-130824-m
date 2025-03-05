package org.telran.lecture_11_greedy_practice.practice.backpack;

// Есть набор предметов, у каждого предмета есть: цена и вес.
// Требуется выбрать из заданного набора предметов наиболее ценные, которые поместятся в рюкзак заданной вместимости.

// Алгоритм
// 1. Рассчитываем удельную ценность для каждого предмета.
// 2. Сортируем предметы по убыванию удельной ценности.
// 3. Складываем предметы в рюкзак(массив), по суммарный вес не превысит максимально допустимый

public class Backpack {
    public static void main(String[] args) {
        // Исходный набор предметов
        Item[] items = {
                new Item("Green", 6, 60),
                new Item("Yellow", 5, 100),
                new Item("Red", 8, 120),
                new Item("Blue", 4, 70),
                new Item("Black", 3, 30)
        };
        int maxWeight = 10; // Максимальная вместимость рюкзака
        Arrays.sort(items, Comparator.comparingInt(i->-i.unit_value));
        int currentWeight = 0;
        int totalValue = 0;
        System.out.println("Selected items:");

        for (Item item : items ) {
            if(currentWeight + item.weight <= maxWeight) {
                currentWeight += item.weight;
                totalValue += item.value;
                System.out.println(item);
            }
        }
        System.out.println("Backpacks total value " + totalValue + " Backpacks current weight " + currentWeight);
    }

}

