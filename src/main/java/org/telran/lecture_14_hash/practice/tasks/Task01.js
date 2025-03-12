// Задача: Дан массив элементов.
// Нужно подсчитать, сколько раз встречается каждый элемент.


function countElementFrequency(elements) {
    const frequencyMap = new Map(); // Создаем Map для хранения частот
    for (let element of elements){
        if (frequencyMap.has(element)){
            frequencyMap.set(element, frequencyMap.get(element) + 1)
        }else {
            frequencyMap.set(element, 1);
        }
    }
    return frequencyMap;
}

const elements = [3, 1, 4, 2, 4, 3, 4, 2, 3, 4, 5, 6];

let result = countElementFrequency(elements);
console.log(result);