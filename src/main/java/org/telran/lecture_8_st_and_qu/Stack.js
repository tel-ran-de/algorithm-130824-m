/** Реализация СТЕКА */
class Stack {
    constructor(size = 100) {
        this.top = -1;
        this.capacity = size
        this.data = new Array(size);
    }

    isEmpty() {
        return (this.top < 0);
    }

    push(x) {
        if (this.top >= (this.capacity - 1)) {
            console.error("Stack Overflow");
            return false;
        } else {
            this.data[++this.top] = x;
            console.log(x + " pushed into stack");
            return true;
        }
    }

    pop() {
        if (this.top < 0) {
            console.error("Stack Underflow");
            return 0;
        } else {
            return this.data[this.top--];
        }
    }

    peek() {
        if (this.top < 0) {
            console.log("Stack Underflow");
            return 0;
        } else {
            return this.data[this.top];
        }
    }

    print() {
        for (let i = this.top; i > -1; i--) {
            console.log(" " + this.data[i]);
        }
    }
}

// Driver code
let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
stack.print();
// console.log(stack.pop() + " Popped from stack");
// console.log("Top element is :" + stack.peek());
// console.log("Elements present in stack :");
// stack.print();