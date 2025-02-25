package org.telran.lecture_11_greedy_practice.practice.hw;

public class Lift {

    private String name;

    private double speed;

    private int currentFloor;

    public Lift(String name, double speed, int floor) {
        this.name = name;
        this.speed = speed;
        this.currentFloor = floor;
    }

    public double diffBetweenFloors(int targetFloor) {
        return Math.abs(targetFloor - currentFloor);
    }

    public double timeToReach(int targetFloor) {
        return diffBetweenFloors(targetFloor) * speed;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", floor=" + currentFloor +
                '}';
    }
}
