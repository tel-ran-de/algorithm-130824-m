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
        canBeBought(24);
    }

    private static void canBeBought(int k) {
        if (k % 5 == 0) {
            System.out.println("Yes");
            return;
        }

        if (k % 3 == 0) {
            System.out.println("Yes");
            return;
        }

        if (k % 5 % 3 == 0) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
    }
}
