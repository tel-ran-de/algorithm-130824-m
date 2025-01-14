package org.telran.lecture_8_st_and_qu.stack;

public class TestClassicStack {
    public static void main(String[] args) {
        ClassicStack stack = new ClassicStack(8);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.print("Stack: ");
        stack.printStack();
        System.out.print(" <-- top");
        System.out.println();

        // remove element from stack
        stack.pop();
        System.out.println("After pop out");
        stack.printStack();

        System.out.println("Call peek()");
        System.out.println(stack.peek());
    }
}
