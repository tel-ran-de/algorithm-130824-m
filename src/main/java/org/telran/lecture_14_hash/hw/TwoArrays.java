package org.telran.lecture_14_hash.hw;

import java.util.HashMap;
import java.util.Map;

public class TwoArrays {

    public static boolean arrayEqual(int[] arr1, int[] arr2) {
        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;

        // If lengths of arrays are not equal
        if (lengthArr1 != lengthArr2) {
            return false;
        }
        // Store arr1[] elements and their counts in hash map
        Map<Integer, Integer> map = new HashMap<>();
        int count;
        for (int idx : arr1) {
            if (map.get(idx) == null)
                map.put(idx, 1);
            else {
                count = map.get(idx);
                count++;
                map.put(idx, count);
            }
        }

        // Traverse arr2[] elements and check if all
        // elements of arr2[] are present same number
        // of times or not.
        for (int idx = 0; idx < lengthArr1; idx++) {

            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(arr2[idx]))
                return false;

            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if (map.get(arr2[idx]) == 0)
                return false;

            count = map.get(arr2[idx]);
            --count;
            map.put(arr2[idx], count);
        }
        return true;
    }
}
