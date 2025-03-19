// Дан массив целых чисел.
// Найти первое вхождение элемента в массиве, который встречается ровно k раз.

// Функция находит первый элемент в массиве, который имеет частоту встречаемости, равную заданному числу k.
// Если такого элемента в массиве нет, функция возвращает -1.
function contains(arr, el){
    for (let i = 0; i < arr.length; i++){
        if (el == arr[i]){return true}
    }
    return false;
}

function firstElement(numbers, k) {
    let frequency = {};
    for (let i = 0; i < numbers.length; i++) {
        if (contains(Object.keys(frequency), numbers[i])){
            frequency[numbers[i]] = frequency[numbers[i]] + 1;
        }else{
            frequency[numbers[i]] = 1;
        }
    }
    for (let i = 0; i < numbers.length; i++){
        if (frequency[numbers[i]] === k){
            return numbers[i];
        }
    }
    // console.log(frequency);
    return -1;
}

// Вариант-2, через Map()
function firstElement(numbers, k) {
    const frequencyMap = new Map();

    // Подсчитываем частоту каждого элемента
    for (let num of numbers) {
        frequencyMap.set(num, (frequencyMap.get(num) || 0) + 1);
    }

    // Ищем первый элемент, который встречается ровно k раз
    for (let num of numbers) {
        if (frequencyMap.get(num) === k) {
            return num;
        }
    }

    return -1;  // Если такого элемента нет
}

let numbers = [2, 8, 2, 0, 4, 6, 4, 10, 8];
let k = 3;


result = firstElement(numbers, k);
console.log(result);
