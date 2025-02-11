// Дан массив положительных целых чисел.
// Найти максимально возможную сумму возрастающего подмассива.
// Подмассив определяется как непрерывная последовательность чисел в массиве.

// Пример 1:
//
// Input: nums = [10,20,30,5,10,50]
// Output: 65
// Пояснение: [5,10,50] — возрастающий подмассив с максимальной суммой 65.

// Пример 2:
//
// Input: nums = [10,20,30,40,50]
// Output: 150
// Пояснение: [10,20,30,40,50] — возрастающий подмассив с максимальной суммой 65.

const nums = [10, 20, 25, 67, 5, 4, 70, 89]

if (nums.length === 0) {
    console.log(0);  
} else {
    let maxSum = nums[0]; 
    let currentSum = nums[0];  

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] > nums[i - 1]) {  
            currentSum += nums[i];  
        } else {
            if (currentSum > maxSum) {  
                maxSum = currentSum;  
            }
            currentSum = nums[i];  
        }
    }

    if (currentSum > maxSum) {
        maxSum = currentSum;
    }

    console.log(maxSum);  
}
