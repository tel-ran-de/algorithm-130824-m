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
    private int currentFloor;
    private int speed; // в секундах на этаж

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

    public static void main(String[] args) {
        Lift liftA = new Lift(4, 3);
        Lift liftB = new Lift(8, 2);
        Lift liftC = new Lift(5, 2);

        List<Lift> lifts = new ArrayList<>();
        lifts.add(liftA);
        lifts.add(liftB);
        lifts.add(liftC);

        int targetFloor = 1;
        Lift fastestLift = null;
        int minTime = Integer.MAX_VALUE;

        for (Lift lift : lifts) {
            int time = lift.calculateTimeToFloor(targetFloor);
            if (time < minTime) {
                minTime = time;
                fastestLift = lift;
            }
        }
        if (fastestLift != null) {
            System.out.println("Отправляем лифт с этажа " + fastestLift.getCurrentFloor() + " - он доедет за " + minTime + " секунд");

        }
    }
}
