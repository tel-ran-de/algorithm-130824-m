/** Динамическич массив в реализации класса */

class DynamicArray {
    constructor() {
        this.array = new Array(1);
        this.count = 0;
        this.size = 1;
    }

    // function add an element at the end of array
    add(data) {
        if (count < size) {
            this.array[this.count] = data;
//            System.out.println("!!!");
            this.count += 1;
        }else {
            // Есть места не хватает
            let tmp = new Array(this.size * 2); // Создаем новый в 2 раза больше
            // Копируем элементы из старого
            for (let i = 0; i < size; i++) {
                tmp[i] = this.array[i];
            }
            this.array = tmp;
            this.size *= 2;
            this.array[this.count] = data;
            this.count++;
        }
    }

    // function remove last element or put zero at last index
    remove() {

    }

    // function add an element at given index
    addAt(index, data) {

    }

    // function shift all element of right side from given index in left
    removeAt(index) {

    }

    getArray(){
        return this.array;
    }

    length() {
        return this.count;
    }
}

let da = new DynamicArray();
console.log(da.length());