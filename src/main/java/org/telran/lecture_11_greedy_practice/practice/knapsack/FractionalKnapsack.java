package org.telran.lecture_11_greedy_practice.practice.knapsack;

import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        /*
        60/10=6
        100/20=5
        120/30=4
        стратегия 1
        50-10 -> 60 [40]
        40-20 -> 100 [20]
        res = 160
        стратегия 2 дробить разрешено
        50-10 -> 60 [40]
        40-20 -> 100 [20]
        20-4*20 -> 80 [0]
        res = 240
        стратегия 3 повторение разрешено
        50-5*10 -> 300 [0]
        res = 300
        */
        int totalWeight = 50;


        int knapsackValue = fillFractionalKnapsack(weight, value, totalWeight);
        System.out.println(knapsackValue);
    }

    private static int fillFractionalKnapsack(int[] weight, int[] value, int totalWeight) {
        Item[] items = createItem(weight, value);
        Arrays.sort(items, ((i1, i2) -> i2.getCost() - i1.getCost()));

        int totalValue = 0;
        Item[] bag = new Item[items.length];

        for (int i = 0; i < items.length && totalWeight > 0; i++) {
            Item item = items[i];
            int curWeight = item.getWeight();
            int curValue = item.getValue();

            if (totalWeight - curWeight >= 0) {
                bag[i] = item;
                totalWeight = totalWeight - curWeight;
                totalValue = totalValue + curValue;
                item.setFraction(curWeight);
            } else {
                bag[i] = item;
                int fraction = totalWeight;
                totalValue = totalValue + (item.getCost() * fraction);
                totalWeight = 0;
                item.setFraction(fraction);
                break;
            }
        }

        System.out.println(Arrays.toString(bag));

        return totalValue;
    }

    private static Item[] createItem(int[] weight, int[] value) {
        Item[] items = new Item[weight.length];
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(weight[i], value[i]);
        }
        return items;
    }
}
