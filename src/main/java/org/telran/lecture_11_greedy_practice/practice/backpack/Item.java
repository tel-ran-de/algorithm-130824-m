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
        this.unit_value = (double) value / weight; // Автоматический расчёт удельной ценности
    }

    @Override
    public String toString() {
        return name + " (Вес: " + weight + ", Цена: " + value + ", Удельная ценность: " + unit_value + ")";
    }

}
