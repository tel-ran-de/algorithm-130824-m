package org.telran.lecture_11_greedy_practice.practice.knapsack;

public class Item {
    private int cost;
    private int weight;
    private int value;
    private int fraction;

    public Item(int weight, int value) {
        this.cost = value / weight;
        this.weight = weight;
        this.value = value;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", value=" + value +
                ", fraction=" + fraction +
                '}';
    }
}
