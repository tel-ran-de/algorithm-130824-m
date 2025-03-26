
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


public class Lift {

    private String name;

    private int currentFloor;

    private int speed;

    public Lift(String name, int currentFloor, int speed) {
        this.name = name;
        this.currentFloor = currentFloor;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArrivalTime(int targetFloor) {
        return Math.abs(currentFloor - targetFloor) * speed;
    }


}

}package org.telran.lecture_11_greedy_practice.practice.hw;

import java.util.List;

public class LiftSystem {
    private List<Lift> lifts;

    public LiftSystem(List<Lift> lifts) {
        this.lifts = lifts;
    }

    public Lift getFastestLift(int targetFloor) {
        Lift fastestLift = lifts.get(0);
        int minTime = fastestLift.getArrivalTime(targetFloor);

        for (Lift lift : lifts) {
            int time = lift.getArrivalTime(targetFloor);
            if (time < minTime) {
                fastestLift = lift;
                minTime = time;
            }
        }
        return fastestLift;
    }
}

package org.telran.lecture_11_greedy_practice.practice.hw;

import java.util.Arrays;

public class LiftApp {

    public static void main(String[] args) {
        Lift liftA = new Lift("A",4,3);
        Lift liftB = new Lift("B",8,2);
        Lift liftC = new Lift("C",5,1);
        Lift liftD = new Lift("D",9,4);

        LiftSystem liftSystem = new LiftSystem(Arrays.asList(liftA, liftB, liftC, liftD));

        int targetFloor = 1;
        Lift fastestLift = liftSystem.getFastestLift(targetFloor);

        System.out.println("Отправляем лифт " + fastestLift.getName());
    }
}
