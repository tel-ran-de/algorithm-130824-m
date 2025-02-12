package org.telran.lecture_10_greedy_algo.practice.coin;

import java.util.ArrayList;
import java.util.List;

// Напишите программу, используя жадный алгоритм.
// Задача:
// Монетная система некоторого государства состоит из монет достоинством: 1, 2, 5, 10
// Требуется выдать сумму x, наименьшим возможным количеством монет.


public class NumberOfCoin {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10};
        int sum = 100;
        System.out.print(getChange(sum, coins));
    }

    private static List<Integer> getChange(int sum, int[] coins) {
        List<Integer> result = new ArrayList<>();
        // You code here
        return result;
    }
}
