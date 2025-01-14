package org.telran.lecture_3_recursion.hw.tower_of_hanoi.solution_java;

public class RecursiveWay {
    public static void main(String[] args) {
        int countOfDisk = 5;
        String source = "source";
        String helper = "helper";
        String destination = "destination";

        towerOfHanoiRecursion(countOfDisk, source, helper, destination);
    }

    private static void towerOfHanoiRecursion(int countOfDisk, String source, String helper, String destination) {
        // Переместить «n-1» диск с «source» на «helper», используя -> destination.
        // Переместить последний диск с «source» на «destination».
        // Переместить «n-1» диск с «helper» на «destination», используя -> source.

        if (countOfDisk == 0) {
            return;
        }

        towerOfHanoiRecursion(countOfDisk - 1, source, destination, helper);
        printMove(countOfDisk, source, destination);
        towerOfHanoiRecursion(countOfDisk - 1, helper, source, destination);
    }

    private static void printMove(int disk, String src, String dest) {
        System.out.println("Move the disk " + disk + " from " + src + " to " + dest);
    }
}
