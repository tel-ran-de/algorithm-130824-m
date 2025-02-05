package org.telran.lecture_08_st_and_qu.queue;


public class ClassicQueue {
    private int[] items;
    private int head; // Индекс первого элемента
    private int tail; // Индекс последнего элемента
    private int size; // Количество элементов в очереди

    public ClassicQueue(int capacity) {
        items = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == items.length) {
//            System.out.println("Queue is full");
            throw new ArrayIndexOutOfBoundsException("Queue is full");
        } else {
            items[tail] = item;
            tail = (tail + 1) % items.length; // Циклический буфер
            size++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int item = items[head];
            head = (head + 1) % items.length; // Циклический буфер
            size--;
            return item;
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return items[head];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

// [][][][]
// enqueue(4)
// [4][][][]
// enqueue(6) -> O(1)
// [4][6][][]
// dequeue() -> O(n) !!!
// [6][][][]

// Циклический буфер
//     h  t
// [x][3][4][]
// head = 1
// tail = 2

// enqueue(6)
//     h     t
// [x][3][4][6]
// head = 1
// tail = 3

// enqueue(8)
//     h     t
// [x][3][4][6]
// tail = (tail+1) % 4;

//[][][][] (4)
// tail 0 -> 1 -> 2 -> 3 -> 0 -> 1 -> 2 -> 3 -> 0

// tail += 1
// if tail >= 4: tail = 0;

// tail = 1
// tail = (tail+1) % 4;
// tail = 2

// tail = 3
// tail = (tail+1) % 4;
// tail = 0