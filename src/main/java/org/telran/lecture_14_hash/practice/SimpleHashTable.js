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

    }

    /**
     * Добавляет пару "ключ-значение" в хэш-таблицу.
     * @param {any} key - Ключ.
     * @param {any} value - Значение.
     */
    set(key, value) {

    }

    /**
     * Возвращает значение по заданному ключу.
     * @param {any} key - Ключ.
     * @returns {any|undefined} - Значение, связанное с ключом, или undefined, если ключ не найден.
     */
    get(key) {

    }

    /**
     * Проверяет, есть ли ключ в хэш-таблице.
     * @param {any} key - Ключ.
     * @returns {boolean} - true, если ключ найден, иначе false.
     */
    has(key) {

    }

    /**
     * Удаляет пару "ключ-значение" из хэш-таблицы.
     * @param {any} key - Ключ.
     */
    remove(key) {

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
myHashTable.set("apple", 10);
myHashTable.set("banana", 20);
myHashTable.set("orange", 30);
myHashTable.set("kivy", 35);
myHashTable.set("guava", 3);
myHashTable.set("lemon", 3);
myHashTable.set("pineapple", 3);
myHashTable.set("red_apple", 12);
myHashTable.set("green_apple", 12);
myHashTable.display();