package org.telran.lecture_1_intro;

import java.util.Scanner;

public class ThreeNumberSum {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1-st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2-nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3-rd number: ");
        int num3 = sc.nextInt();
        sum = num1 + num2 + num3;
        System.out.println("Sum of the 3 numbers is = " + sum);
    }
}
