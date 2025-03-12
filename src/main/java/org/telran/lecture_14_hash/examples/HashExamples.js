const crypto = require('crypto');


function hash_key_mode(key, tableSize) {
    if (typeof key !== 'number') {
        // Преобразуем строку в число (простой пример)
        let hash = 0;
        for (let i = 0; i < key.length; i++) {
            hash += key.charCodeAt(i);
        }
        key = hash;
    }
    return key % tableSize;
}

function multiplicationHash(key, tableSize) {
    if (typeof key !== 'number') {
        // Преобразуем строку в число (простой пример)
        let hash = 0;
        for (let i = 0; i < key.length; i++) {
            hash += key.charCodeAt(i);
        }
        key = hash;
    }
    const A = 0.6180339887; // Константа (золотое сечение)
    const fractionalPart = (key * A) % 1;
    return Math.floor(fractionalPart * tableSize);
}

function sha256Hash(data) {
    const hash = crypto.createHash('sha256');
    hash.update(data);
    return hash.digest('hex');
}

function sha1Hash(data) {
    const hash = crypto.createHash('sha1');
    hash.update(data);
    return hash.digest('hex');
}


const myData = 'Hello, world!';
const hashedData1 = sha1Hash(myData);
const hashedData256 = sha256Hash(myData);
console.log(`hashedData1 =      ${hashedData1}`);
console.log(`hashedData256 =    ${hashedData256}`);


// const simpleHashedData2 = sha256Hash(myData);
const keys = ["Hello", "Hell", "hell", "help", "Hi", "Alex", "Ivan", "John", "Kapibara", "My name is", "Abu", "key", "22"];
const tableSize = 100;

for (const key of keys) {
    console.log(`hash_key_mode("${key}", ${tableSize}) = ${hash_key_mode(key, tableSize)}`);
}
console.log("-------------------------------------")
for (const key of keys) {
    console.log(`multiplicationHash("${key}", ${tableSize}) = ${multiplicationHash(key, tableSize)}`);
}

let myObject = {};
myObject["key1"] = "value1";
myObject[42] = "value2";
console.log(myObject["key1"])

let myMap = new Map();
let objKey = { id: 1 };
myMap.set("key1", "value1");
myMap.set(objKey, "value2");
console.log(myMap.get(objKey));