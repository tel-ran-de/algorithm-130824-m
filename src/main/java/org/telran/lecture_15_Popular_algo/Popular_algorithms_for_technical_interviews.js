/** Window Sliding */
// Подход в лоб:
function maxSumNaiveApproach(arr, k) {
    let length = arr.length;
    let max = 0;

    for (let i = 0; i < length - k + 1; i++) {
        let current = 0;
        for (let j = 0; j < k; j++) {
            current = current + arr[i + j];
            max = Math.max(current, max);
        }
    }
    return max;
}

let arr = [1, 55, 2, 10, 2, 13, 1, 0, 3];
let k = 3;
console.log(maxSumNaiveApproach(arr, k));



// Подход скользящее окно
function maxSumSlidingWindow(arr, k) {
    let length = arr.length;
    if (length < k) {
        console.log("wrong size of array");
        return -1;
    }

    let max = 0;
    for (let i = 0; i < k; i++)
        max += arr[i];

    let windowSum = max;
    for (let i = k; i < length; i++) {
        windowSum += arr[i] - arr[i - k];
        max = Math.max(max, windowSum);
    }

    return max;
}

let arr = [1, 55, 2, 10, 2, 13, 1, 0, 3];
let k = 3;
console.log(maxSumSlidingWindow(arr, k));


// Техника двух указателей
function findPairSumTwoPoint(arr, sum) {
    let length = arr.length;
    let i = 0; // first pointer
    let j = length - 1; // second pointer

    while (i < j) {
        if (arr[i] + arr[j] == sum) { // If we find a pair
            console.log("Yes");
            return;
        } else if (arr[i] + arr[j] < sum) {
            i++;
        } else {
            j--;
        }
    }
    console.log("No");
}

let arr = [1, 2, 3, 4, 5];
let sum = 6;
findPairSumTwoPoint(arr, sum);


// Пример - решаем вместе
class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

function removeNodeFromEnd(head, n) {
    let fast = head;
    let slow = head;

    for (let i = 0; i < n; i++) {
        fast = fast.next;
    }

    while (fast.next !== null) {
        fast = fast.next;
        slow = slow.next;
    }

    slow.next = slow.next.next;
}

let head = new Node(1);
let second = new Node(2);
let third = new Node(3);
let fourth = new Node(4);

head.next = second;
second.next = third;
third.next = fourth;

removeNodeFromEnd(head, 2);
console.log(head);

