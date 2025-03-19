/**
 * Класс, представляющий хэш-таблицу.
 */
class HashTable {
    /**
     * Создает экземпляр хэш-таблицы.
     * @param {number} [size=10] - Размер хэш-таблицы.
     */
    constructor(size = 10) {
        this.table = new Array(size);
        this.size = size;
    }

    /**
     * Вычисляет хэш-код для заданного ключа.
     * @param {any} key - Ключ для вычисления хэш-кода.
     * @returns {number} - Хэш-код ключа.
     */
    hash(key) {
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
        return Math.floor(fractionalPart * this.size);
    }

    /**
     * Добавляет пару "ключ-значение" в хэш-таблицу.
     * @param {any} key - Ключ.
     * @param {any} value - Значение.
     */
    set(key, value) {
        let hash = this.hash(key);
        if (this.table[hash] === undefined) {
            this.table[hash] = [[key, value]];
        } else { // коллизия
            this.table[hash].push([key, value]);
        }
    }

    /**
     * Возвращает значение по заданному ключу.
     * @param {any} key - Ключ.
     * @returns {any|undefined} - Значение, связанное с ключом, или undefined, если ключ не найден.
     */
    get(key) {
        let hash = this.hash(key);
        let pairs = this.table[hash];
        for (let pair of pairs){
            if (pair[0] === key){
                return pair[1];
            }
        }
    }

    /**
     * Проверяет, есть ли ключ в хэш-таблице.
     * @param {any} key - Ключ.
     * @returns {boolean} - true, если ключ найден, иначе false.
     */
    has(key) {
        let hash = this.hash(key);
        let pairs = this.table[hash];
        for (let pair of pairs){
            if (pair[0] === key){
                return true;
            }
        }
        return false;
    }

    /**
     * Удаляет пару "ключ-значение" из хэш-таблицы.
     * @param {any} key - Ключ.
     */
    remove(key) {
        let hash = this.hash(key);
        let pairs = this.table[hash];
        for (let pair of pairs){
            if (pair[0] === key){
                this.removeSubarray(pairs, pair);
                return;
            }
        }
    }

    removeSubarray(arr, subarrayToRemove) {
        arr.forEach((item, index) => {
            if (Array.isArray(item) && JSON.stringify(item) === JSON.stringify(subarrayToRemove)) {
                arr.splice(index, 1);
            }
        });
    }

    equals(arr1, arr2){
        if (arr1.length !== arr2.length) {return false}
        for (let i = 0; i < arr1.length; i ++){
            if (arr1[i] !== arr2[i]) { return false}
        }
        return true;
    }

    /**
     * Выводит содержимое хэш-таблицы в консоль.
     */
    display() {
        for (let i = 0; i < this.size; i++) {
            if (this.table[i]) {
                console.log(i, ":", this.table[i]);
            }
        }
    }
}


// Пример использования
const myHashTable = new HashTable();
myHashTable.set("apple", "apple");
myHashTable.set("banana", "banana");
myHashTable.set("orange", "orange");
myHashTable.set("kivy", "kivy");
myHashTable.set("guava", "guava");
myHashTable.set("lemon", "lemon");
myHashTable.set("pineapple", "pineapple");
myHashTable.set("red_apple", "red_apple");
myHashTable.set("green_apple", "green_apple");
myHashTable.display();
console.log("--------------------------------")
myHashTable.remove("red_apple");
myHashTable.remove("guava");
myHashTable.display();
// console.log(myHashTable.get("pineapple"))
// console.log(myHashTable.get("red_apple"))
// console.log(myHashTable.has("orange"))
// console.log(myHashTable.has("nope"))
// 0: [["apple", "apple"], ["lemon", "lemon"]]