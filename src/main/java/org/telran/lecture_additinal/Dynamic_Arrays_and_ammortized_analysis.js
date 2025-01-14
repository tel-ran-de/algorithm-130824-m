/** Динамическич массив в реализации класса */

class DynamicArray {
    constructor() {
        this.array = new Array(1);
        this.count = 0;
        this.size = 1;
    }
    // function add an element at the end of array
    add(data) {
        // check no of element is equal to size of array
        if (this.count === this.size) {
            this.growSize(); // make array size double
        }
        this.array[this.count] = data; // insert element at end of array
        this.count++;
    }
    // function makes size double of array
    growSize() {
        let temp = new Array(0);
        if (this.count === this.size) {
            // temp is a double size array of array
            // and store array elements
            temp = new Array(this.size * 2);
            for (let i = 0; i < this.size; i++) {
                temp[i] = this.array[i]; // copy all array value into temp
            }
        }
        this.array = temp;
        this.size = this.size * 2;
    }
    // the function reduces the size of the array, removes empty cells
    shrinkSize() {
        let temp = new Array(0);
        if (this.count > 0) {
            temp = new Array(this.count); // temp is a count size array and store array elements
            for (let i = 0; i < this.count; i++) {
                temp[i] = this.array[i]; // copy all array value into temp
            }
            this.size = this.count;
            this.array = temp;
        }
    }
    // function add an element at given index
    addAt(index, data) {
        if (this.count === this.size) { // if size is not enough make size double
            this.growSize();
        }
        for (let i = this.count - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i]; // shift all element right from given index
        }
        this.array[index] = data; // insert data at given index
        this.count++;
    }
    // function remove last element or put zero at last index
    remove() {
        if (this.count > 0) {
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }
    // function shift all element of right side from given index in left
    removeAt(index) {
        if (this.count > 0) {
            for (let i = index; i < this.count - 1; i++) {
                this.array[i] = this.array[i + 1]; // shift all element of right side from given index in left
            }
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }
}

let da = new DynamicArray();
da.add(1);
da.add(2);
da.add(3);
da.add(4);
da.add(5);
da.add(6);
da.add(7);
da.add(8);
da.add(9);

// print all array elements after add 9 elements
console.log("Elements of array:");
for (let i = 0; i < da.size; i++) {
    console.log(da.array[i] + " ");
}

// print size of array and no of element
console.log("Size of array: " + da.size);
console.log("No of elements in array: " + da.count);

// shrinkSize of array
da.shrinkSize();

// print all array elements
console.log("Elements of array after shrinkSize of array: ");
for (let i = 0; i < da.size; i++) {
    console.log(da.array[i] + " ");
}

// print size of array and no of element
console.log("Size of array: " + da.size);
console.log("No of elements in array: " + da.count);

// add an element at index 1
da.addAt(1, 22);

// print Elements of array after adding an
// element at index 1
console.log("Elements of array after add an element at index 1:");
for (let i = 0; i < da.size; i++) {
    console.log(da.array[i] + " ");
}

// print size of array and no of element
console.log("Size of array: " + da.size);
console.log("No of elements in array: " + da.count);

// delete last element
da.remove();

// print Elements of array after delete last
// element
console.log("Elements of array after delete last element:");
for (let i = 0; i < da.size; i++) {
    console.log(da.array[i] + " ");
}

// print size of array and no of element
console.log("Size of array: " + da.size);
console.log("No of elements in array: " + da.count);

// delete element at index 1
da.removeAt(1);

// print Elements of array after delete
// an element index 1
console.log("Elements of array after delete element at index 1:");
for (let i = 0; i < da.size; i++) {
    console.log(da.array[i] + " ");
}

// print size of array and no of element
console.log("Size of array: " + da.size);
console.log("No of elements in array: " + da.count);
