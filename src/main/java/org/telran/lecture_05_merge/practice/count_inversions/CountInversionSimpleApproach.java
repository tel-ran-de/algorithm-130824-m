package org.telran.lecture_05_merge.practice.count_inversions;

public class CountInversionSimpleApproach {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 20, 6, 4, 5};
        System.out.println("Number of inversions are " + getInvCount(arr));
    }

   private static int getInvCount(int[] arr) {
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }
}
