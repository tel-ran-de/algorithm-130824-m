package org.telran.lecture_7_dynamic_array.hw;
import java.util.Arrays;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        int length = da.length();
        System.out.println(length);
        da.add(42);
        da.add(100);
        da.add(101);
        da.add(101);
        da.add(101);
        da.add(101);
        da.add(101);
        da.add(101);
        da.add(101);
        length = da.length();
        System.out.println(length);
        System.out.println(Arrays.toString(da.getArray()));
    }
}


// 1 -> 2 -> 4 -> 8 -> 16
