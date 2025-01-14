package org.telran.lecture_3_recursion;

public class FirstPractice {
    private static int functionIteration(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res = res + i;
            System.out.println("res = " + res + "; n = " + n);
        }
        return res;
    }

    private static int functionRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        int res = n + functionRecursion(n - 1);
        System.out.println("res = " + res + "; n = " + n);
        return res;
    }
}
