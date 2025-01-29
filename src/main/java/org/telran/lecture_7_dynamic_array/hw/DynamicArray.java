package org.telran.lecture_7_dynamic_array.hw;

import java.util.Arrays;

public class DynamicArray {
    private int[] array; // variable array[] is an array
    private int count; // count will deal with no of element add by you
    private int size; // size will with size of array[]

    public DynamicArray() {
        array = new int[1]; // Внутренний массив, для хранения элементов
        count = 0;  // Количество занятых ячеек массива
        size = 1;   // Физический размер массива в памяти
    }

    private void growSize() {
        int[] tmp = new int[size * 2]; // Создаем новый в 2 раза больше
        // Копируем элементы из старого
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
        size *= 2;
    }

    // function add an element at the end of array
    public void add(int data) {
        if (count >= size) { // Есть места не хватает
            growSize();
        }
        array[count] = data;
        count++;
    }

    // function remove last element
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    // function add an element at given index
    public void addAt(int index, int data) {
        if (count < size) { // Есть места хватает
            for (int i = count - 1; i >= index; i--) {
                array[i + 1] = array[i]; // сдвигаем все элементы вправо от текущего индекса
            }

            array[index] = data;
            count++;

        } else { // Есть места не хватает
            growSize();

            for (int i = count - 1; i >= index; i--) {
                array[i + 1] = array[i]; // сдвигаем все элементы вправо от текущего индекса
            }

            array[index] = data;
            count++;
        }
    }

    // function shift all element of right side from given index in left
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // сдвигаем все элементы влево до текущего индекса
            }
            array[count - 1] = 0;
            count--;
        }
    }

    public int[] getArray() {
        // вернуть первые count элементов массива array
        // [1, 2, 3, 0]
        // [1, 2, 3]
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public int length() {
        return count;
    }

    @Override
    public String toString(){
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return "DA"+Arrays.toString(result);
    }
}

//  0   1   2   3   4
// [3] [2] [0] [9] [ ]
// arr.addAt(1, 5)
// [3] [ ] [2] [0] [9] - shift
// [3] [5] [2] [0] [9] - insert

//arr.remove()
// [3] [2] [0] [ ] [ ]


// [3] [5] [2] [1] [9]
// arr.removeAt(2)

// [3] [5] [1] [9] [...]
// 3 --> 00011
// 0 --> 00000

// "Code" Ч.Петцольд

//new Array(4);
//[ ][ ][ ][ ]

// RAM: [0][0][0][1][1]
// RAM: [0][0][0][0][0]

// [3] [5] [2] [1] [9]
// arr.set(1, 8) -> O(1)

// [3] [8] [2] [1] [9]

// [ ] count = 1

// DRY