package org.telran.lecture_03_recursion;

public class SecondPractice {

    public static void main(String[] args) {
        funRecursion(3, 5);
        funIteration(3, 5);
    }
    private static int funRecursion(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            int res = funRecursion(x - 1, x + y);
            System.out.println("res = " + res + "; x = " + x + "; y = " + y);
            return res;
        }
    }

    // task solution
    private static int funIteration(int x, int y) {
        for (int i = 0; i < x; i++) {
            System.out.println("x = " + (x - i) +" y = " + y);
            y = (x - i) + y;
        }
        return y;
    }


}
