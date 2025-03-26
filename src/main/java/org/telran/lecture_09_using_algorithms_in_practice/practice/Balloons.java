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

// 1 - No
// 2 - No
// 3 - Yes
// 4 - No
// 5 - Yes
// 6 - Yes
// 7 - No
// 8 - Yes
// 9 - Yes
// 10 - Yes
// 11 - Yes
// 12 - Yes
// 13 - Yes

public class Balloons {
    public static void main(String[] args) {
        System.out.println(isPossibleToBuy(7));
    }

    public static boolean isPossibleToBuy(int k) {
        for (int i = 0; i * 5 <= k; i++) {
            int rest = k - (i * 5);
            if (rest % 3 == 0) {
                return true;
            }
        }
        return false;
    }
}
