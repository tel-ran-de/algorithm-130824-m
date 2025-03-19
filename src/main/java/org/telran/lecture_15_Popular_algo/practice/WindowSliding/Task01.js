// Дан массив целых чисел и число k.
// Найти максимальную сумму подмассива длины k.

let numbers = [3, 0, 5, 4, 12, 2, 6, 100, 0];
let k = 3;

let left = 0;
let right = k - 1;

let maxSum = 0;
for (let i = 0; i <= numbers.length - k; i++) {
    let subNumbers = numbers.slice(left, right + 1);
    let sum = 0;
    for (let el of subNumbers){
        sum += el;
    }
    if (sum > maxSum){
        maxSum = sum;
    }
    left++;
    right++;
}
