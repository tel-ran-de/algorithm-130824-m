function createSourceTower(countOfDisk, source) {
    for (let i = countOfDisk; i >= 1; i--) {
        source.push(i);
    }
}

function helperMoveDiskBetweenTwoPoles(source, destination, poleSrc, poleDest) {
    let sourceTopDisk = source.length === 0 ? 0 : source.pop();
    let destinationTopDisk = destination.length === 0 ? 0 : destination.pop();

    if (sourceTopDisk === 0) {
        destination.push(destinationTopDisk);
        console.log(`Move disk ${destinationTopDisk} from ${poleDest} to ${poleSrc}`);
    } else if (destinationTopDisk === 0) {
        destination.push(sourceTopDisk);
        console.log(`Move disk ${sourceTopDisk} from ${poleSrc} to ${poleDest}`);
    } else if (sourceTopDisk > destinationTopDisk) {
        source.push(sourceTopDisk);
        source.push(destinationTopDisk);
        console.log(`Move disk ${destinationTopDisk} from ${poleDest} to ${poleSrc}`);
    } else if (sourceTopDisk < destinationTopDisk) {
        destination.push(destinationTopDisk);
        destination.push(sourceTopDisk);
        console.log(`Move disk ${sourceTopDisk} from ${poleSrc} to ${poleDest}`);
    }
}

function towerOfHanoiIterative(countOfDisk, source, helper, destination) {
    let moves = Math.pow(2, countOfDisk) - 1;
    let poleSrc = 'source';
    let poleHelper = 'helper';
    let poleDest = 'destination';

    for (let i = 1; i <= moves; i++) {
        if (i % 3 === 1) {
            helperMoveDiskBetweenTwoPoles(source, destination, poleSrc, poleDest);
        } else if (i % 3 === 2) {
            helperMoveDiskBetweenTwoPoles(source, helper, poleSrc, poleHelper);
        } else if (i % 3 === 0) {
            helperMoveDiskBetweenTwoPoles(helper, destination, poleHelper, poleDest);
        }
    }
}

// example usage
let sourceStack = [];
let helperStack = [];
let destinationStack = [];
let countOfDisk = 3;

createSourceTower(countOfDisk, sourceStack);
towerOfHanoiIterative(countOfDisk, sourceStack, helperStack, destinationStack);
