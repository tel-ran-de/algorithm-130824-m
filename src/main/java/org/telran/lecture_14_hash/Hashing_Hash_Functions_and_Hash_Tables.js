/** Хеш-функции */

class Team {
    constructor(language, department) {
        this.language = language;
        this.department = department;
    }

    equals(o) {
        // implementation
    }
}

let leaders = new Map();
leaders.set(new Team("Java", "server"), "Aleks");
leaders.set(new Team("Python", "server"), "Thea");
leaders.set(new Team("Python", "ui"), "Thomas");

let myTeam = new Team("Java", "development");
let myTeamLeader = leaders.get(myTeam);
console.log(myTeamLeader);


// Наивный подход
// Driver Code
function naiveApproach() {
    let arr = [1, 7, 4, 3, 4, 8, 7];
    let n = arr.length;
    let k = 2;
    console.log(firstElement(arr, n, k));
}

function firstElement(arr, n, k) {
    // This loop is used for selection
    // of elements
    for (let i = 0; i < n; i++) {
        // Count how many times selected element
        // occurs
        let count = 0;
        for (let j = 0; j < n; j++) {
            if (arr[i] === arr[j]) {
                count++;
            }
        }

        // Check, if it occurs k times or not
        if (count === k) {
            return arr[i];
        }
    }

    return -1;
}
naiveApproach();

// Эффективный подход
// use this function:
function firstElement(arr, n, k) {
    let map = new Map();
    for (let i = 0; i < n; i++) {
        let a = map.get(arr[i]) || 0;
        map.set(arr[i], a + 1);
    }
    for (let i = 0; i < n; i++) {
        if (map.get(arr[i]) === k) {
            return arr[i];
        }
    }
    return -1;
}

