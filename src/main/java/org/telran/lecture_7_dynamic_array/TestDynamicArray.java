package org.telran.lecture_7_dynamic_array;

public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);

        // print all array elements after add 9 elements
        System.out.println("Elements of array:");
        for (int i = 0; i < da.getSize(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }

        // print getSize() of array and no of element
        System.out.println("Size of array: " + da.getSize());
        System.out.println("No of elements in array: " + da.getCount());

        // shrinkSize of array
        da.shrinkSize();

        // print all array elements
        System.out.println("Elements of array after shrinkSize of array: ");
        for (int i = 0; i < da.getSize(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }

        // print getSize() of array and no of element
        System.out.println("Size of array: " + da.getSize());
        System.out.println("No of elements in array: " + da.getCount());

        // add an element at index 1
        da.addAt(1, 22);

        // print Elements of array after adding an
        // element at index 1
        System.out.println("Elements of array after add an element at index 1:");
        for (int i = 0; i < da.getSize(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }

        // print getSize() of array and no of element
        System.out.println("Size of array: " + da.getSize());
        System.out.println("No of elements in array: " + da.getCount());

        // delete last element
        da.remove();

        // print Elements of array after delete last
        // element
        System.out.println("Elements of array after delete last element:");
        for (int i = 0; i < da.getSize(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }

        // print getSize() of array and no of element
        System.out.println("Size of array: " + da.getSize());
        System.out.println("No of elements in array: " + da.getCount());

        // delete element at index 1
        da.removeAt(1);

        // print Elements of array after delete
        // an element index 1
        System.out.println("Elements of array after delete element at index 1:");
        for (int i = 0; i < da.getSize(); i++) {
            System.out.print(da.getArray()[i] + " ");
        }

        // print getSize() of array and no of element
        System.out.println("Size of array: " + da.getSize());
        System.out.println("No of elements in array: " + da.getCount());
    }
}
