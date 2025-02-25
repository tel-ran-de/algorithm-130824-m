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

package org.telran.lecture_11_greedy_practice.practice.hw;

import java.util.Arrays;
import java.util.Comparator;

public class LiftApp {

    public static void main(String[] args) {

        //test with floor 3
        Lift[] lifts = new Lift[]{
                new Lift("B", 2, 9),
                new Lift("C", 1.5, 11),
                new Lift("D", 1, 15),
                new Lift("A", 3, 7),
                new Lift("E", 2.5, 9)
        };

        Lift[] liftsTwo = new Lift[]{
                new Lift("A", 3, 4),
                new Lift("B", 2, 8),
                new Lift("C", 2, 5),
        };

        Arrays.stream(liftsTwo).forEach(System.out::println);

        System.out.println("\n" + callLift(1, liftsTwo));
    }

    public static Lift callLift(int floor, Lift[] lifts) {
        Arrays.sort(lifts, Comparator.comparingDouble((Lift a) -> a.timeToReach(floor))
                .thenComparing(a -> a.diffBetweenFloors(floor)));
        return lifts[0];
    }
}
