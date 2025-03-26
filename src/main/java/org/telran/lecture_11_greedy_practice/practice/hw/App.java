package org.telran.lecture_11_greedy_practice.practice.hw;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Lift liftOne = new Lift(3, 4);
        Lift liftTwo = new Lift(2, 8);
        Lift liftThree = new Lift(2, 5);
        Lift fastestLift = Lift.findFastest(Arrays.asList(liftOne, liftTwo, liftThree).toArray(new Lift[0]), 1);
        System.out.println(fastestLift);
    }
}
