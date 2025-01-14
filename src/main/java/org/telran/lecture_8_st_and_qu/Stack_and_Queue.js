/** Реализация СТЕКА */
class Stack {
    constructor() {
        this.MAX = 1000;
        this.top = -1;
        this.a = new Array(this.MAX);
    }

    isEmpty() {
        return (this.top < 0);
    }

    push(x) {
        if (this.top >= (this.MAX - 1)) {
            console.log("Stack Overflow");
            return false;
        } else {
            this.a[++this.top] = x;
            console.log(x + " pushed into stack");
            return true;
        }
    }

    pop() {
        if (this.top < 0) {
            console.log("Stack Underflow");
            return 0;
        } else {
            return this.a[this.top--];
        }
    }

    peek() {
        if (this.top < 0) {
            console.log("Stack Underflow");
            return 0;
        } else {
            return this.a[this.top];
        }
    }

    print() {
        for (let i = this.top; i > -1; i--) {
            console.log(" " + this.a[i]);
        }
    }
}

// Driver code
let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
console.log(stack.pop() + " Popped from stack");
console.log("Top element is :" + stack.peek());
console.log("Elements present in stack :");
stack.print();


/** ЗАДАЧА getMin from STACK */
class SpecialStack {
    constructor() {
        this.stack = [];
        this.helper = [];
    }

    push(x) {
        if (this.stack.length === 0) {
            this.stack.push(x);
            this.helper.push(x);
        } else {
            this.stack.push(x);
            let min = this.helper.pop();
            if (x < min) {
                this.helper.push(x);
            } else {
                this.helper.push(min);
            }
        }
    }

    pop() {
        let x = this.stack.pop();
        this.helper.pop();
        return x;
    }

    getMin() {
        let min = this.helper.pop();
        this.helper.push(min);
        return min;
    }
}

let spacialTest = new SpecialStack();
spacialTest.push(10);
spacialTest.push(24);
spacialTest.push(36);
console.log(spacialTest.getMin());
spacialTest.push(5);
console.log(spacialTest.getMin());

/** ЗАДАЧА Q */
class Queue {
    constructor() {
        this.items = [];
    }

    enqueue(element) {
        this.items.push(element);
    }

    dequeue() {
        if (this.isEmpty()) {
            return "Underflow";
        }
        return this.items.shift();
    }

    front() {
        if (this.isEmpty()) {
            return "No elements in Queue";
        }
        return this.items[0];
    }

    isEmpty() {
        return this.items.length === 0;
    }

    printQueue() {
        let str = "";
        for (let i = 0; i < this.items.length; i++) {
            str += this.items[i] + " ";
        }
        return str;
    }
}

let queue = new Queue();
console.log(queue.isEmpty());  // Output: true

queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
console.log(queue.printQueue()); // Output: 1 2 3
console.log(queue.dequeue());    // Output: 1
console.log(queue.front());      // Output: 2



/** ГЕНЕРИРУЕМ ДВОИЧНЫЕ ЧИСЛА ОТ 1 до n */
class Main {
    static generate(n) {
        // Create an empty queue and add "1" to it
        let q = [];
        q.push("1");

        // Run `n` times
        for (let i = 1; i <= n; i++) {
            // Add 0 and 1 to the first element of the queue and
            // put both strings back in the queue
            q.push(q[0] + '0');
            q.push(q[0] + '1');

            // Remove the front element and print it
            console.log(q.shift() + ' ');
        }
    }

    doGenerate() {
        let n = 16;
        Main.generate(n);
    }
}

new Main().doGenerate();




