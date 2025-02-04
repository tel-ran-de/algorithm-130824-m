function towerOfHanoiRecursion(countOfDisk, source, helper, destination) {
    if (countOfDisk === 0) {
        return;
    }

    towerOfHanoiRecursion(countOfDisk - 1, source, destination, helper);
    printMove(countOfDisk, source, destination);
    towerOfHanoiRecursion(countOfDisk - 1, helper, source, destination);
}

function printMove(disk, src, dest) {
    console.log("Move the disk " + disk + " from " + src + " to " + dest);
}

let countOfDisk = 5;
let source = "source";
let helper = "helper";
let destination = "destination";

towerOfHanoiRecursion(countOfDisk, source, helper, destination);
