package org.telran.lecture_06_quick.hw;

public class QuickSortIterative {

    public static void quickSortIterative(int[] arr, int startIdx, int endIdx) {
        // Create an auxiliary stack
        int[] stack = new int[endIdx - startIdx + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of startIdx and endIdx to stack
        stack[++top] = startIdx;
        stack[++top] = endIdx;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop endIdx and startIdx
            endIdx = stack[top--];
            startIdx = stack[top--];

            // Set pivot element at its correct position in sorted array
            int pivot = partition(arr, startIdx, endIdx);

            // If there are elements on left side of pivot, then push left side to stack
            if (pivot - 1 > startIdx) {
                stack[++top] = startIdx;
                stack[++top] = pivot - 1;
            }

            // If there are elements on right side of pivot, then push right side to stack
            if (pivot + 1 < endIdx) {
                stack[++top] = pivot + 1;
                stack[++top] = endIdx;
            }
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        // index of smaller element
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
