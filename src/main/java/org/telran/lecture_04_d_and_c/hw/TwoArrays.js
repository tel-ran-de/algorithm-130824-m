function getElementTwoSortedArrays(arr1, arr2, key) {
    let length1 = arr1.length;
    let length2 = arr2.length;
    let sorted1 = Array(length1 + length2).fill(0);
    let i = 0, j = 0, d = 0;
    while (i < length1 && j < length2) {
        if (arr1[i] < arr2[j])
            sorted1[d++] = arr1[i++];
        else
            sorted1[d++] = arr2[j++];
    }
    while (i < length1)
        sorted1[d++] = arr1[i++];
    while (j < length2)
        sorted1[d++] = arr2[j++];
    return sorted1[key - 1];
}

let arr1 = [ 2, 3, 6, 7, 9 ];
let arr2 = [ 1, 4, 8, 10 ];
let key = 5;
document.write(getElementTwoSortedArrays(arr1, arr2, key));
 