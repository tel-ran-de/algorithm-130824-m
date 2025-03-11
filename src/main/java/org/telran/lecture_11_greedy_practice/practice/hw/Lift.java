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


import java.util.NoSuchElementException;

public class Lift {

    private static int totalQuantity = 1;

    private final int liftNumber;

    private final int speed;

    private final int currentFloor;

    public Lift(int speed, int currentFloor) {
        this.speed = speed;
        this.currentFloor = currentFloor;
        this.liftNumber = totalQuantity++;
    }

    public int getSpeed() {
        return speed;
    }

    public static Lift findFastest(Lift[] lifts, int targetFlor) {
        if (lifts == null || lifts.length == 0) {
            throw new NoSuchElementException();
        }

        Lift result = lifts[0];
        for (Lift lift : lifts) {
            if (calculateTime(lift, targetFlor) < calculateTime(result, targetFlor)) {
                result = lift;
            }
        }
        return result;
    }

    private static int calculateTime(Lift lift, int targetFloor) {
        return Math.abs(lift.currentFloor - targetFloor) * lift.getSpeed();
    }

    @Override
    public String toString() {
        return "Lift " + liftNumber + "{" +
                "speed=" + speed +
                ", currentFloor=" + currentFloor +
                '}';
    }
}
