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

function MaxAscendingSum(nums) {

}


console.assert(MaxAscendingSum([10, 20, 30, 5, 10, 50]) === 65, "Test-1");
console.assert(MaxAscendingSum([60, 58, 55]) === 60, "Test-2");
console.assert(MaxAscendingSum([10, 20, 30, 40, 50]) === 150, "Test-3");
console.assert(MaxAscendingSum([0]) === 0, "Test-4");
console.assert(MaxAscendingSum([]) === 0, "Test-5");
console.assert(MaxAscendingSum([1, 2, 3, 1, 2, 3, 1, 2]) === 6, "Test-6");
console.assert(MaxAscendingSum([30, 0, 5, 10, 9, 10, 10]) === 30, "Test-7");
console.assert(MaxAscendingSum([20, 20, 20, 20]) === 20, "Test-8");