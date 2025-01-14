package org.telran.lecture_10_greedy_algo.hw;

public class Utils {
    public static int determineCost(int activityStart, int activityEnd) {
        int edge = 13;
        int temp = (activityStart + activityEnd) / 2;
        return temp >= edge ? 2 : 1;
    }
}
