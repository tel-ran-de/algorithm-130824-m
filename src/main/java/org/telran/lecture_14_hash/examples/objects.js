// Создание объекта "person" с помощью литерала объекта
let person = {
    firstName: "Иван",
    lastName: "Иванов",
    age: 30,
    city: "Москва",
    isStudent: false,
    hobbies: ["чтение", "спорт", "путешествия"],
    address: {
        street: "ул. Ленина, 10",
        zip: "123456"
    },
    sayHello: function() {
        console.log(`Привет, меня зовут ${this.firstName} ${this.lastName}!`);
    }
};

// Доступ к свойствам объекта
console.log(person.firstName); // Выводит "Иван"
console.log(person.age); // Выводит 30
console.log(person.hobbies[0]); // Выводит "чтение"
console.log(person.address.street); // Выводит "ул. Ленина, 10"

// Изменение свойств объекта
person.age = 31;
person.city = "Санкт-Петербург";

// Добавление нового свойства
person.job = "программист";

// Вызов метода объекта
person.sayHello(); // Выводит "Привет, меня зовут Иван Иванов!"

// Использование квадратных скобок для доступа к свойствам
console.log(person["lastName"]); // Выводит "Иванов"

// Итерация по свойствам объекта с помощью цикла for...in
for (let key in person) {
    console.log(`${key}: ${person[key]}`);
}

// Проверка наличия свойства в объекте
if ("job" in person) {
    console.log("У person есть свойство job");
}

// Удаление свойства из объекта
delete person.job;