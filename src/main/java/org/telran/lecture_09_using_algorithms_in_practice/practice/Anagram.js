// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).
// Даны две строки.
// Проверить, являются ли они анаграммами (состоят из одних и тех же букв, но в разном порядке).

const string1 = 'кот';
const string2 = 'тоК';
const string3 = 'тор';
const string4 = 'тОрс';
const string5 = 'Сорт';



//---------------------------------------------------------------------------------------------------------------

const areAnarmm = (str1, str2) => {
  if (str1.length !== str2.length) return false;

  const newStr1 = str1.toLowerCase().split('').sort().join('');
  const newStr2 = str2.toLowerCase().split('').sort().join('');

  return newStr1 === newStr2;
};


//---------------------------------------------------------------------------------------------------------------

console.log(areAnarmm(string1, string2));
console.log(areAnarmm(string1, string3));
console.log(areAnarmm(string1, string4));
console.log(areAnarmm(string5, string4));


console.log(string1.toLowerCase().split('').sort());
console.log(string2.toLowerCase().split('').sort());
console.log(string3.toLowerCase().split('').sort());
console.log(string4.toLowerCase().split(''))
console.log(string5.toLowerCase().split('').sort());
console.log(string1.toLowerCase().split('').sort().join(''));
console.log(string2.toLowerCase().split('').sort().join(''));
console.log(string3.toLowerCase().split('').sort().join(''));
console.log(string4.toLowerCase().split('').sort().join(''));
console.log(string5.toLowerCase().split('').sort().join(''));
