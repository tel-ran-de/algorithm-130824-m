const strings = ["я", "мир", "привет", "программирование"];

strings.sort((a, b) => a.length - b.length);
console.log(strings); // Вывод: ["я", "мир", "привет", "программирование"]


strings.sort((a, b) => b.length - a.length);
console.log(strings); // Вывод: ["программирование", "привет", "мир", "я"]