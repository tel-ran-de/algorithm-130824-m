package org.telran.lecture_1_intro;

public class EuclideanAlgo {
    public static void main(String[] args) {
        int a = 148;
        int b = 8;
        long start = System.nanoTime();
        greatestCommonDeliver(a, b);
        long end = System.nanoTime();
        System.out.println("Euclidean algorithm = " + (end - start));
        start = System.nanoTime();
        getGcd(a, b);
        end = System.nanoTime();
        System.out.println("Common for = " + (end - start));
    }

    public static void greatestCommonDeliver(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println("gcd = " + a);
    }

    private static void getGcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("gcd = " + gcd);
    }
}
