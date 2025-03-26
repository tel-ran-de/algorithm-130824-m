package org.telran.lecture_11_greedy_practice.practice.backpack;

public class Item {

    public String name;
    public int weight;
    public int value;
    public double unit_value; // Удельная ценность - цена за единицу веса

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.unit_value = (double) (this.value / this.weight);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public double getUnitValue() {
        return unit_value;
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
