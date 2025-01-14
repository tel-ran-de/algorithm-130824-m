package org.telran.lecture_10_greedy_algo.practice.coin;

import java.util.ArrayList;
import java.util.List;

public class NumberOfCoin {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10};
        int sum = 100;
        System.out.print("Following is minimal number of change for " + sum + ": " + getChange(sum, coins));
    }

    private static List<Integer> getChange(int sum, int[] coins) {
        List<Integer> result = new ArrayList<>();
        for (int i = coins.length - 1; i >= 0; i--) {
            while (sum >= coins[i]) {
                sum -= coins[i];
                result.add(coins[i]);
            }
        }
        return result;
    }
}
