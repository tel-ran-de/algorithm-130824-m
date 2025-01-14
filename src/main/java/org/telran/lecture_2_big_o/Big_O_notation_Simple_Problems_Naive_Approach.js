/** Пространственная сложность */

function sayHello() {
    console.log("Hello World");
}

function sayManyHello() {
    let n = 8;
    for (let i = 1; i <= n; i++) {
        console.log("Hello World !!!");
    }
}

sayHello();
sayManyHello();

/** Сумму двух чисел */

function sumTwoNumbers(one, two) {
    return one + two;
}

sumTwoNumbers(2, 1);

/** Сумма всех элементов массива */

function listSum(array) {
    let result = 0;                         // cost = 1 times = 1
    for(let i = 0; i < array.length; i++) { // cost = 3 times = n + 1
        result = result + array[i];         // cost = 2 times = n 
    }
    return result;                          // cost = 1 times = 1
}

listSum([4, 7, 8, 2, 3, 6]);

/**  Самостоятельня 1 */

function fork(n) {
    if(n < 5) {
        console.log("number < 5")
    } else {
        for(let i = 0; i<n; i++) {
            console.log(i + " ");
        }
    }
}

fork(7);

/** Самостоятельня 2 */

function doubleFor(n) {
    for (let i = 0; i <= n / 3; i++){
        for (let j = 1; j <= n; j = j + 4){
            console.log("I study Big O notation");
        }
    }
}

doubleFor(88);





