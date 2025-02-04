const numbers = [10, 2, 1, 5, 20];

// Сортировка по возрастанию:
numbers.sort((a, b) => a - b);
console.log(numbers); // Вывод: [1, 2, 5, 10, 20]

// Сортировка по убыванию:
numbers.sort((a, b) => b - a);
console.log(numbers); // Вывод: [20, 10, 5, 2, 1]