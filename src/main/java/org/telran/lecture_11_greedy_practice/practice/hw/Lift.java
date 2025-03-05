package org.telran.lecture_11_greedy_practice.practice.hw;

// Задача: вызов лифта
// В доме n лифтов, у каждого лифта своя скорость, измеряемая в сек/этаж (секунд на один этаж).
// Реализовать алгоритм отправки лифта, который приедет быстрее всего.
// Алгоритм будет применяться в домах разной этажности.
// Алгоритм будет применяться в домах с количеством > 2 лифтов
// Пример:
//  в доме 19 этажей
//  работают лифт А, лифт В и лифт C
//  лифт А находится на 4 этаже и движется со скоростью 3 сек/этаж.
//  лифт В находится на 8 этаже и движется со скоростью 2 сек/этаж.
//  лифт C находится на 5 этаже и движется со скоростью 2 сек/этаж.
//  На вход: 1 (вызываем на первый этаж)
//  результат: отправляем лифт С

import java.util.ArrayList;
import java.util.List;

public class Lift {

    private final int currentFloor;
    private final int speed;

    public Lift(int currentFloor, int speed) {
        this.currentFloor = currentFloor;
        this.speed = speed;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getSpeed() {
        return speed;
    }

    public int calculateTimeToFloor(int targetFloor) {
        return Math.abs(targetFloor - currentFloor) * speed;
    }
}

class ElevatorSystem {
    private final List<Lift> lifts;

    public ElevatorSystem(List<Lift> lifts) {
        this.lifts = lifts;
    }

    public Lift findFastestLift(int targetFloor) {
        Lift fastestLift = null;
        int minTime = Integer.MAX_VALUE;

        for (Lift lift : lifts) {
            int time = lift.calculateTimeToFloor(targetFloor);
            if (time < minTime) {
                minTime = time;
                fastestLift = lift;
            }
        }

        if (fastestLift == null) {
            throw new RuntimeException("Нет доступных лифтов");
        }

        return fastestLift;
    }

    public static void main(String[] args) {
        List<Lift> lifts = new ArrayList<>();
        lifts.add(new Lift(3, 3));
        lifts.add(new Lift(6, 2));
        lifts.add(new Lift(2, 2));

        ElevatorSystem elevatorSystem = new ElevatorSystem(lifts);
        int targetFloor = 10;
        Lift fastestLift = elevatorSystem.findFastestLift(targetFloor);

        System.out.println("Lift start from " + fastestLift.getCurrentFloor() +
                ", time: " + fastestLift.calculateTimeToFloor(targetFloor) + " sec");
    }
}
