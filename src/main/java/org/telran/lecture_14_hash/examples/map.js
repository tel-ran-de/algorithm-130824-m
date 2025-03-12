// Создание Map
let myMap = new Map();

// Использование различных типов ключей
let objKey = {id: 1};
let funcKey = function () {
};
let symbolKey = Symbol("mySymbol");

// Добавление элементов в Map
myMap.set("firstName", "Иван");
myMap.set("age", 30);
myMap.set(objKey, "значение объекта");
myMap.set(funcKey, "значение функции");
myMap.set(symbolKey, "значение символа");

// Получение значений по ключам
console.log(myMap.get("firstName")); // Выводит "Иван"
console.log(myMap.get(objKey)); // Выводит "значение объекта"
console.log(myMap.get(funcKey)); // Выводит "значение функции"
console.log(myMap.get(symbolKey)); // Выводит "значение символа"

// Проверка наличия ключа
console.log(myMap.has("age")); // Выводит true
console.log(myMap.has({id: 1})); // Выводит false (это другой объект)

// Получение размера Map
console.log(myMap.size); // Выводит 5

// Удаление элемента
myMap.delete("age");
console.log(myMap.size); // Выводит 4

// Итерация по Map
for (let [key, value] of myMap) {
    console.log(`${key}: ${value}`);
}

// Очистка Map
myMap.clear();
console.log(myMap.size); // Выводит 0