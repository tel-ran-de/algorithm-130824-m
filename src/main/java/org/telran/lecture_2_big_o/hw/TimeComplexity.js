// test 1
function test1(n) {
    if (n === 1) {
        return;
    }
    for (let i = 1; i <= n; i++) { // cost = 3 times = n
        for (let j = 1; j <= n; j++) { // cost = 3 times = 1
            console.log("*");
            break;
        }
    }
} // best O(1), worst 3(n)*3+1 = O(n)

// test 2
function test2(n) {
    let a = 0;
    let i, j;
    for (i = 0; i < n; i++) { // cost = 3 times = n + 1
        for (j = n; j > i; j--) { // cost = 3 times = n - 1
            a = a + i + j;
        }
    }
} // (3+n)*(3+n-1) = n^2+5n+6 = O(n^2)

// test 3
function test3(n) {
    let a = 0;
    let i, j;
    for (i = Math.floor(n / 2); i <= n; i++) { // cost = 4 times = n/2
        for (j = 2; j <= n; j = j * 2) { // cost = 4 times = (n = 8) (j = 2,4,8) j^x = n = log(n)
            a = a + Math.floor(n / 2);
        }
    }
} // 4n/2log(n) = O(n log n)

// test 4
function test4(n) {
    let a = 0;
    let i = n;
    while (i > 0) { // cost = 1 times = i/2 = n^x (n = 32 = n/2 = 2^4 = 16)
        a += i;
        i = Math.floor(i / 2);
    }
} // 1+n/2^x = O(log n)