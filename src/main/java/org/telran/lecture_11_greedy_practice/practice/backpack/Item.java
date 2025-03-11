package org.telran.lecture_11_greedy_practice.practice.backpack;

import lombok.Getter;

@Getter
public class Item {
    private String name;
    private int weight;
    private int value;
    private int unit_value; // Удельная ценность - цена за единицу веса

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.unit_value = value / weight;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", value=" + value +
                ", unit_value=" + unit_value +
                "}";
    }
}
