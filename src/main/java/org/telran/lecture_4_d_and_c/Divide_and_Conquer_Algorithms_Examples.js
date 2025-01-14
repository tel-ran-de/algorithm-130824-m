/** Практика: наименьшее и наибольшее число */
function mainInit() {
    let arr = [70, 250, 50, 300, 1];
    console.log(getMaxElement(arr, 0));
    console.log(getMinElement(arr, 0));
}

function fibonacciRecursion(number) {
    if (number < 2) {
        return 1;
    }
    return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
}
function fibonacciUpgrade(number, arr) {
    if (number < 2) {
        return 1;
    }
    if (arr[number] !== -1) {
        return arr[number];
    }
    arr[number] = fibonacciUpgrade(number - 1, arr) + fibonacciUpgrade(number - 2, arr);
    return arr[number];
}

function getMaxElement(arr, index) {
    let max;
    let length = arr.length;

    if (length > index) {
        max = getMaxElement(arr, index + 1);
        if (arr[index] > max)
            return arr[index];
        else
            return max;

    } else {
        return arr[index - 1];
    }
}

function getMinElement(arr, index) {
    let min;
    let length = arr.length;

    if (length > index) {
        min = getMinElement(arr, index + 1);
        if (arr[index] < min)
            return arr[index];
        else
            return min;

    } else {
        return arr[index - 1];
    }
}
mainInit();