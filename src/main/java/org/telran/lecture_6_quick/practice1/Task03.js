// "Сумма с условием"
// Дан массив произвольных целых чисел
// Найти: сумму элементов списка, больших данного числа a. Значение a можно задать самостоятельно.
// Примечание: Используйте алгоритм сортировки, если нужно.

// 1
let numbers = [1, 12, 3, 14, 5, -4, 20];
let a = 10;
let summa = 0;

for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] > a) {
        summa += numbers[i];
    }
}
console.log(summa);

// 2
const a = 10;
const newNumbers1 = numbers.filter((el) => el >= a).reduce((a, b) => a + b);
console.log(newNumbers1);