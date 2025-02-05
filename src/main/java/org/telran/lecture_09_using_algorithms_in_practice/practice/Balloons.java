package org.telran.lecture_09_using_algorithms_in_practice.practice;

// В магазине продают только по три и по пять воздушных шариков.
// Можно ли купить ровно k шариков?

// Пример 1:
// Input: 8
// Output: Yes
// Пояснение: Можно купить 5 + 3 шарика

// Пример 2:
// Input: 10
// Output: Yes
// Пояснение: Можно купить 5 + 5 шариков

// Пример 3:
// Input: 7
// Output: No
// Пояснение: Никакими комбинациями 5 и 3, 7 шариков купить невозможно

public class Balloons {

    public static void main(String[] args) {
        int k = 7;

        if (canBuy(k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean canBuy(int k) {
        for (int i = 0; i <= k / 3; i++) {
            for (int j = 0; j <= k / 5; j++) {
                if (i * 3 + j * 5 == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
