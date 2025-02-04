let queue = [];

queue.push(1); // [1]
queue.push(2); // [1, 2]
queue.push(3); // [1, 2, 3]

let firstElement = queue.shift(); // 1, queue теперь [2, 3]
console.log("firstElement = " + firstElement)
firstElement = queue.shift(); // 2, queue теперь [3]

console.log(queue); // [3]