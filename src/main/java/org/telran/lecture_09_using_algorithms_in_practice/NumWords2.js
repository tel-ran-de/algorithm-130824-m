let wort = "mamamilaramu";
wort = wort.toLowerCase();
const countChar = {};

for (let char of wort) {
    countChar[char] = (countChar[char] || 0) + 1;
}

// O(logn*n)
Object.keys(countChar).forEach(char => {
    console.log(`${char} - ${countChar[char]}`);
});