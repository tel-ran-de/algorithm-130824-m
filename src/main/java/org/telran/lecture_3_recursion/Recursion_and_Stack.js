/** Рекуррентный случай */
function functionIteration(n) {
    let res = 0;
    for (let i = 0; i <= n; i++) {
        res = res + i;
        console.log(`res = ${res}; n = ${n}`);
    }
    return res;
}

functionIteration(5);

function recursiveFunction(n) {
    if (n === 1) {
        return 1;
    }
    let res = n + recursiveFunction(n - 1);
    console.log(`res = ${res}; n = ${n}`);
    return res;
}

recursiveFunction(5);

/** Classwork 1 */
function funRecursion(x, y) {
    if (x === 0) {
        return y;
    } else {
        let res = funRecursion(x - 1, x + y);
        console.log(`Res = ${res}; x = ${x}; y = ${y}`);
        return res;
    }
}

funRecursion(2, 5);

/** Самостоятельная */
function funIteration(x, y) {
    for (let i = 0; i < x; i++) {
        console.log(`x = ${x - i} y = ${y}`);
        y = (x - i) + y;
    }
    return y;
}

funIteration(2, 5);


/** Функция, которая проверяет букву: согласная или нет */
function isConsonant(letter) {
    letter = letter.toUpperCase();
    return letter.charCodeAt() >= 65
        && letter.charCodeAt() <= 90
        && !(letter === 'A'
            || letter === 'E'
            || letter === 'I'
            || letter === 'O'
            || letter === 'U');
}

isConsonant('Е');

function countConsonantIteration(str) {
    let count = 0;
    for(let i = 0; i < str.length; i++) {
        if(isConsonant(str[i])) {
            count++;
        }
    }
    return count;
}

countConsonantIteration('Tel-Ran');

/** Самостоятельная */
function countConsonantRecursion(str, n) {
    let res = 0;
    if (n === 1) {
        res = isConsonant(str[0]) ? 1 : 0;
        console.log(`Now res = ${res}`);
        return res;
    }
    if (isConsonant(str[n - 1])) {
        res = countConsonantRecursion(str, n - 1) + 1;
        console.log(`Now res = ${res}`);
        return res;
    } else {
        res = countConsonantRecursion(str, n - 1);
        console.log(`Now res = ${res}`);
        return res;
    }
}

countConsonantRecursion("Tel-Ran", 4);

