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

import java.util.Scanner;

public class Balloons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pay = scanner.nextInt();
       payBalloons(pay);
      scanner.close();
    }

    public static void payBalloons(int balloons) {
        if (balloons < 3 | balloons == 4 | balloons == 7) {
            System.out.println("Покупка не возможна!");
        } else {
            System.out.println("Поздравляем с покупкой!");
        }
    }
}
