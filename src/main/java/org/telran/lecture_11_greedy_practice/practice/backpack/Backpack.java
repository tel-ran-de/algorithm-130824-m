package org.telran.lecture_11_greedy_practice.practice.backpack;

// Есть набор предметов, у каждого предмета есть: цена и вес.
// Требуется выбрать из заданного набора предметов наиболее ценные, которые поместятся в рюкзак заданной вместимости.

// Алгоритм
// 1. Рассчитываем удельную ценность для каждого предмета.
// 2. Сортируем предметы по убыванию удельной ценности.
// 3. Складываем предметы в рюкзак(массив), по суммарный вес не превысит максимально допустимый

public static void main(String[] args) {
        Item[] items = new Item[]{ // Исходный набор предметов
                new Item("Pen", 1, 15, 15),
                new Item("Phone", 3, 20, 6),
                new Item("Laptop", 5, 30, 6),
                new Item("Pencil", 1, 12, 12),
                new Item("Keyboard", 6, 40, 6),
                new Item("Mouse", 2, 16, 8),
        };
        int totalWeight = 10; // Максимальная вместимость рюкзака

        fillBackpack(items, totalWeight);
    }

    public static void fillBackpack(Item[] items, int totalWeight) {
        Arrays.sort(items, (a, b) -> Integer.compare(b.unit_value, a.unit_value));

        int currentWeight = 0;
        int totalValue = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= totalWeight) {
                currentWeight = currentWeight + item.weight;
                totalValue = totalWeight + item.value;
            }
        }

        System.out.println("Total weight: " + currentWeight);
        System.out.println("Total value: " + totalValue);
    }
}
