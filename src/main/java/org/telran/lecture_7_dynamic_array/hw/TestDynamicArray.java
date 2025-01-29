package org.telran.lecture_7_dynamic_array.hw;
import java.util.Arrays;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        System.out.println(da.length());
        System.out.println(Arrays.toString(da.getArray()));
        da.remove();
        System.out.println(Arrays.toString(da.getArray()));
        da.addAt(1, 10);
        System.out.println(Arrays.toString(da.getArray()));
        da.removeAt(0);
        System.out.println(Arrays.toString(da.getArray()));
    }
}