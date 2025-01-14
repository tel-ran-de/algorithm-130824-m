function partition(arr, low, high) {
    let temp;
    let pivot = arr[high];

    // index of smaller element
    let i = (low - 1);
    for (let j = low; j <= high - 1; j++) {
        // If current element is smaller than or equal to pivot
        if (arr[j] <= pivot) {
            i++;
            // swap arr[i] and arr[j]
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // swap arr[i+1] and arr[high] (or pivot)

    temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}

/* A[] --> Array to be sorted,
startIndex --> Starting index,
endIndex --> Ending index */
function quickSortIterative(arr, startIndex, endIndex) {
    // Create an auxiliary stack
    let stack = new Array(endIndex - startIndex + 1);
    stack.fill(0);

    // initialize top of stack
    let top = -1;

    // push initial values of startIndex and endIndex to stack
    stack[++top] = startIndex;
    stack[++top] = endIndex;

    // Keep popping from stack while
    // is not empty
    while (top >= 0) {
        // Pop endIndex and startIndex
        endIndex = stack[top--];
        startIndex = stack[top--];

        // Set pivot element at its correct position in sorted array
        let pivot = partition(arr, startIndex, endIndex);

        // If there are elements on left side of pivot, then push left side to stack
        if (pivot - 1 > startIndex) {
            stack[++top] = startIndex;
            stack[++top] = pivot - 1;
        }

        // If there are elements on right side of pivot, then push right side to stack
        if (pivot + 1 < endIndex) {
            stack[++top] = pivot + 1;
            stack[++top] = endIndex;
        }
    }
}

let arr = [4, 3, 5, 2, 1, 3, 2, 3];
let n = 8;

quickSortIterative(arr, 0, n - 1);

for (let i = 0; i < n; i++)
    console.log(arr[i] + " ");