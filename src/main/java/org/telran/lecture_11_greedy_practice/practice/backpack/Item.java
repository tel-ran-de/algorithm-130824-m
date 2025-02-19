package org.telran.lecture_11_greedy_practice.practice.backpack;

public class Item {
    public String name;
    public int weight;
    public int value;
    public int unit_value; // Удельная ценность - цена за единицу веса

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.unit_value = (int) value / weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", value=" + value +
                ", unit_value=" + unit_value +
                '}';
    }
}
