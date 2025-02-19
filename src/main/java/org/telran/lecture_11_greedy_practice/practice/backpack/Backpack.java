package org.telran.lecture_11_greedy_practice.practice.backpack;

        Item[] items = new Item[]{ // Исходный набор предметов
                new Item("aple", 2, 50, 25),
                new Item("banana", 3, 30, 10),
                new Item("pine", 5, 25, 5),
                new Item("orange", 7, 14, 2),
                new Item("kivi", 5, 200, 40),
        };
        int totalWeight = 0; // Максимальная вместимость рюкзака

        Arrays.sort(items, Comparator.comparing(Item::getUnit_value).reversed());
        System.out.println(Arrays.toString(items));
        List<Item> listRes = new ArrayList<>();
        for (Item item : items) {
            if (totalWeight < 10) {
                listRes.add(item);
                totalWeight = totalWeight + item.getWeight();
            }
        }
        System.out.println("----------------------------");
        System.out.println(listRes);
    }
