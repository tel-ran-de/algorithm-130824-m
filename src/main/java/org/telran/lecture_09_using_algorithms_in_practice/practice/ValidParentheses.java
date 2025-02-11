package org.telran.lecture_09_using_algorithms_in_practice.practice;

// Дана строка s, содержащая только символы '(', ')', '{', '}', '[' и ']'.
// Определите, является ли входная строка допустимой.
//
// Входная строка допустима, если:
//
// 1. Открытые скобки должны быть закрыты скобками того же типа.
// 2. Открытые скобки должны быть закрыты в правильном порядке.
// 3. Каждой закрывающейся скобке соответствует открытая скобка того же типа.

// Пример 1:
// Input: s = "()"
// Output: true

// Пример 2:
// Input: s = "[()[]{}]"
// Output: true

// Пример 3:
// Input: s = "(]"
// Output: false

// Пример 4:
// Input: s = "([(]))"
// Output: false

public class ValidParentheses {

   public static void main(String[] args) {
        String trueOne = "()";
        String trueTwo = "[()[]{}]";
        String falseOne = "(]";
        String falseTwo = "([(]))";

        System.out.println(trueOne + " should be valid: " + isValidString(trueOne));
        System.out.println(trueTwo + " should be valid: " + isValidString(trueTwo));
        System.out.println(falseOne + " should be false: " + isValidString(falseOne));
        System.out.println(falseTwo + " should be false: " + isValidString(falseTwo));
    }

    private static boolean isValidString(String s) {
        char[] parentheses = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < parentheses.length; i++) {
            if (parentheses[i] == '(' || parentheses[i] == '{' || parentheses[i] == '[') {
                stack.push(parentheses[i]);
            } else if (parentheses[i] == ')' && !stack.isEmpty() && stack.peek().equals('(')) {
                stack.pop();
            } else if (parentheses[i] == ']' && !stack.isEmpty() && stack.peek().equals('[')) {
                stack.pop();
            } else if (parentheses[i] == '}' && !stack.isEmpty() && stack.peek().equals('{')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
