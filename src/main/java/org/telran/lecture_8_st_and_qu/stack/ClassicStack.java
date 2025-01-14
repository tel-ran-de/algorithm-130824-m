package org.telran.lecture_8_st_and_qu.stack;

public class ClassicStack {

    private final int[] arr;
    private int top;
    private final int capacity;

    public ClassicStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        } else {
            // insert element on top of stack
            System.out.println("Inserting " + x);
            arr[++top] = x;
        }
    }

    // pop elements from top of stack
    public int pop() {
        // if stack is empty no element to pop
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // pop element from top of stack
        return arr[top--];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top];
        }
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

