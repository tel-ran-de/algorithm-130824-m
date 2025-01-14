package org.telran.lecture_4_d_and_c.practice.fibonacci_numbers;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int num = 5;
        int[] arr = new int[num + 1];
        for(int i = 2; i <= num; i++) {
            arr[i] = -1;
        }

        System.out.println(fibonacciRecursion(num));
        System.out.println(fibonacciUpgrade(num, arr));
    }

    private static int fibonacciRecursion(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
    private static int fibonacciUpgrade(int n, int[] arr) {
        if (n < 2) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = fibonacciUpgrade(n - 1, arr) + fibonacciUpgrade(n - 2, arr);
        return arr[n];
    }

}
