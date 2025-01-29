let stack = [];

stack.push(1); // [1]
stack.push(2); // [1, 2]
stack.push(3); // [1, 2, 3]

let topElement = stack.pop(); // 3, stack теперь [1, 2]
console.log(topElement);
topElement = stack.pop(); // 2, stack теперь [1]
console.log(stack); // [1]