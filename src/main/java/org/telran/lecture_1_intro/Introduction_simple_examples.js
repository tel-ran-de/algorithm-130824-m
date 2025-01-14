/** Алгоритм линейного поиска */

function linearSearch() {
    let arr = [1, 2, 3, 4, 5, 6];
    console.log(`Number exists? = ${getNumber(arr, 6)}`);
}

function getNumber(arr, number) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === number) {
            return true;
        }
    }
    return false;
}

linearSearch();


/** Алгоритм сложения 3 чисел и вывода их суммы */
function threeNumbersSum() {
    let sum = 0;
    let num1 = parseInt(prompt("Enter the 1st number: "));
    console.log(` ${num1}`);
    let num2 = parseInt(prompt("Enter the 2nd number: "));
    console.log(` ${num2}`);
    let num3 = parseInt(prompt("Enter the 3rd number: "));
    console.log(` ${num3}`);
    sum = num1 + num2 + num3;
    console.log(`Sum of the 3 numbers is = ${sum}`);
}

threeNumbersSum();

/** Алгоритм Евклида
 *  Формула НОД: НОД (a, b) = НОД (b, с), где с — остаток от деления a на b */

function euclideanAlgorithm() {
    let a = 48;
    let b = 8;
    let start = performance.now();
    greatestCommonDeliver(a, b);
    let end = performance.now();
    console.log(`Euclidean algorithm = ${end - start}`);
    start = performance.now();
    getGcd(a, b);
    end = performance.now();
    console.log(`for = ${end - start}`);
}

function greatestCommonDeliver(a, b) {
    while (b !== 0) {
        let tmp = a % b;
        a = b;
        b = tmp;
    }
    console.log(`gcd = ${a}`);
}

function getGcd(a, b) {
    let gcd = 1;
    for (let i = 1; i <= a && i <= b; i++) {
        if (a % i === 0 && b % i === 0) {
            gcd = i;
        }
    }
    console.log(`gcd = ${gcd}`);
}

euclideanAlgorithm();



