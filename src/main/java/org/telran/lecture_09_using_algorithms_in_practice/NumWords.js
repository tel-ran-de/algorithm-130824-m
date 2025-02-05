let word = "AbbaaCcc"; //

// Приводим к нижнему регистру, чтобы a и A считались одинаковыми
word = word.toLowerCase();

// Создаём массив из 26 элементов (для букв a-z)
let counts = new Array(26).fill(0);

// Проходим по строке и считаем буквы
// O(n)
for (let i = 0; i < word.length; i++) {
    if (word[i] >= 'a' && word[i] <= 'z') {
        let codeCharA = 97;
        let charIndex = word[i].charCodeAt() - codeCharA;
        counts[charIndex] += 1; // Увеличиваем счётчик для соответствующей буквы
    }
}

// Выводим буквы и их количество
// O(n) --> O(n)
for (let i = 0; i < counts.length; i++) {
    if (counts[i] !== 0) { // Выводим только те буквы, которые встречались
        let char_name = String.fromCharCode(i + 97)
        console.log(char_name, counts[i]);
    }
}