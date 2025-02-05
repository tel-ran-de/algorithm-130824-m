// 1. Создание
let emptyArray = new Array(); // пустой массив
let myArray = new Array(5); // массив длиной 5, заполненный undefined

// 2. Добавление в конец массива
myArray.push(40);

// 3. Удаляет последний элемент из массива и возвращает его значение.
let lastElement = myArray.pop();

// 4. Получение элементов
myArray = [10, 20, 30];
console.log(myArray[0]); // выведет 10
console.log(myArray[2]); // выведет 30

// 5. Замена элемента
myArray[0] = 100; // Запись 100 на позицию с индексом 0

// 6. Перебор элементов
for (let i = 0; i < myArray.length; i++) {
    console.log(myArray[i]);
}

for (let element of myArray) {
    console.log(element);
}

// Все методы Array: https://www.programiz.com/javascript/library/array
