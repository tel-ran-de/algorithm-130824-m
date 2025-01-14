/** Частотный Словарь */

function buildDictionary(text) {
    text = text.toLowerCase();

    let result = ['я' - 'а' + 1];
    for (let i = 0; i < text.length; i++) {
        let ch = text.charAt(i);
        if (ch >= 'а' && ch <= 'я') {
            result[ch - 'а']++;
        }
    }

    for (let i = 0; i < result.length; i++) {
        console.log((i + 'а') + " = " + result[i]);
    }
}

buildDictionary("арфвыжаожровыы");
