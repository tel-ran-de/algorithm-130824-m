
function getChange(sum, coins) {
    let result = [];
    for (let i = coins.length - 1; i >= 0; i--) {
        while (sum >= coins[i]) {
            sum -= coins[i];
            result.push(coins[i]);
        }
    }
    for (let i = 0; i < result.length; i++) {
        console.write(" " + result[i]);
    }
}