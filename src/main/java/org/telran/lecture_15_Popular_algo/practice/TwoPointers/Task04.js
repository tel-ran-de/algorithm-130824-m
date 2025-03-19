// Дан отсортированный массив целых чисел и число target.
// Найти два числа в массиве, сумма которых равна target.

function sumTarget(numbers, target) {
    let left = 0;
    let right = numbers.length - 1;
    while (left !== right){
        let sum = numbers[left] + numbers[right];
        if (sum === target){
            return [numbers[left], numbers[right]]
        } else if(sum < target){
            left++;
        }else{
            right--;
        }
    }
    return [];
}

let numbers = [2, 4, 7, 11, 14, 16, 17, 19, 22]
let target = 400;

let result = sumTarget(numbers, target);
console.log(result);