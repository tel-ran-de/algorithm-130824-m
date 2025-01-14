/** Алгоритм задачи выбора */

class Job {
    constructor(id, deadline, profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    // Function to schedule the jobs take 2 arguments
    // arraylist and no of jobs to schedule
    printJobScheduling(arr, t) {
        // Length of array
        let n = arr.length;
        // Sort all jobs according to decreasing order of
        // profit
        arr.sort((a, b) => b.profit - a.profit);

        // To keep track of free time slots
        let result = new Array(t).fill(false);

        // To store result (Sequence of jobs)
        let job = new Array(t);

        // Iterate through all given jobs
        for (let i = 0; i < n; i++) {
            // Find a free slot for this job (Note that we
            // start from the last possible slot)
            for (let j = Math.min(t - 1, arr[i].deadline - 1); j >= 0; j--) {
                // Free slot found
                if (result[j] === false) {
                    result[j] = true;
                    job[j] = arr[i].id;
                    break;
                }
            }
        }

        // Print the sequence
        for (let jb of job)
            console.log(jb + " ");
        console.log();
    }
}

// Driver code
let arr = [
    new Job('a', 2, 100),
    new Job('b', 1, 19),
    new Job('c', 2, 27),
    new Job('d', 1, 25),
    new Job('e', 3, 15)
];

console.log("Following is maximum profit sequence of jobs");

let job = new Job();

// Calling function
job.printJobScheduling(arr, 3);

class Activiny {
    constructor(name, start, finish) {
        this.name = name;
        this.start = start;
        this.finish = finish;
    }
}

class ActiSel {
    selectActivity(list) {
        list.sort((a, b) => a.finish - b.finish);
        let res = [];
        this.print(list);
        console.log("------");
        let first = list[0];
        let last = first.finish;
        res.push(first);

        for(let i = 1; i < list.length; i++) {
            if(list[i].start >= last) {
                last = list[i].finish;
                res.push(list[i]);
            }
        }
        this.print(res);
    }

    selectJobScheduling(arr, t) {
        // Length of array
        let n = arr.length;
        // Sort all jobs according to decreasing order of
        // profit
        arr.sort((a, b) => b.profit - a.profit);
        // To keep track of free time slots
        let result = new Array(t).fill(false);
        // To store result (Sequence of jobs)
        let job = new Array(t);
        // Iterate through all given jobs
        for (let i = 0; i < n; i++) {
            // Find a free slot for this job (Note that we
            // start from the last possible slot)
            for (let j = Math.min(t - 1, arr[i].deadline - 1); j >= 0; j--) {
                // Free slot found
                if (result[j] === false) {
                    result[j] = true;
                    job[j] = arr[i].id;
                    break;
                }
            }
        }
        // Print the sequence
        for (let jb of job)
            console.log(jb + " ");
        console.log();
    }

    print(list) {
        for (let e of list) {
            console.log(e.name);
        }
    }
}
let list = [    new Activiny("a", 1,3),    new Activiny("b", 1,7),    new Activiny("c", 2,4),    new Activiny("d", 5,9),    new Activiny("e", 4,6),    new Activiny("f", 7,8)];

let ActiJob = new ActiSel();
ActiJob.selectActivity(list);
