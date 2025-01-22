package org.telran.lecture_7_dynamic_array.hw;

public class DynamicArray {
    private int[] array; // variable array[] is an array
    private int count; // count will deal with no of element add by you
    private int size; // size will with size of array[]

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }
//    [ ][ ][ ][ ][ ]
//

    // function add an element at the end of array
    public void add(int data) {
        if (count < size) {
            array[count] = data;
//            System.out.println("!!!");
            count++;
        }else {
            // Есть места не хватает
            int[] tmp = new int[size * 2]; // Создаем новый в 2 раза больше
            // Копируем элементы из старого
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
            size *= 2;
            array[count] = data;
            count++;
        }
    }

    // function remove last element
    public void remove() {

    }

    // function add an element at given index
    public void addAt(int index, int data) {

    }

    // function shift all element of right side from given index in left
    public void removeAt(int index) {

    }

    public int[] getArray() {
        return array;
    }

    public int length() {
        return count;
    }

}
