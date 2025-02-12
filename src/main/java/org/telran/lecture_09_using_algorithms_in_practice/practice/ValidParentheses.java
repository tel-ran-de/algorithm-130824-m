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

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        assert isValidString("()");
        assert isValidString("[()[]{}]");
        assert !isValidString("(]");
        assert !isValidString("([(]))");
        assert isValidString("{{(([]))}}");
        assert !isValidString("{{(([)])}}");
    }

    private static boolean isValidString(String s) {
//        char[] s = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek().equals('(')) {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek().equals('[')) {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek().equals('{')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
