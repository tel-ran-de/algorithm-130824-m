package org.telran.lecture_7_dynamic_array;

public class DynamicArray {
    private int[] array; // variable array[] is an array
    private int count; // count will deal with no of element add by you
    private int size; // size will with size of array[]

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    // function add an element at the end of array
    public void add(int data) {
        // check no of element is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        }
        array[count] = data; // insert element at end of array
        count++;
    }

    // function makes size double of array
    public void growSize() {
        int[] temp = new int[0];
        if (count == size) {
            // temp is a double size array of array
            // and store array elements
            temp = new int[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    temp[i] = array[i]; // copy all array value into temp
                }
            }
        }
        array = temp;
        size = size * 2;
    }

    // the function reduces the size of the array, removes empty cells
    public void shrinkSize() {
        int[] temp = new int[0];
        if (count > 0) {
            temp = new int[count]; // temp is a count size array and store array elements
            for (int i = 0; i < count; i++) {
                temp[i] = array[i]; // copy all array value into temp
            }
            size = count;
            array = temp;
        }
    }

    // function add an element at given index
    public void addAt(int index, int data) {
        if (count == size) { // if size is not enough make size double
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i]; // shift all element right from given index
        }
        array[index] = data; // insert data at given index
        count++;
    }

    // function remove last element or put zero at last index
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    // function shift all element of right side from given index in left
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // shift all element of right side from given index in left
            }
            array[count - 1] = 0;
            count--;
        }
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
