/** Динамическич массив в реализации класса */

class DynamicArray {
    constructor() {
        this.array = new Array(1);
        this.count = 0;
        this.size = 1;
    }

    // function add an element at the end of array
    add(data) {

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