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

    // function add an element at the end of array
    public void add(int data) {
        if (count < size) { // Есть места хватает
            array[count] = data;
            count++;
        } else { // Есть места не хватает
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
            int[] tmp = new int[size * 2]; // Создаем новый в 2 раза больше
            // Копируем элементы из старого
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
            size *= 2;

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
        return array;
    }

    public int length() {
        return count;
    }
}
