// Дан массив имен.
// Найдите самое длинное имя, если таких имен несколько - выведи любое их них

const names = ['Oleg', 'Anna', 'Max', 'Anton', 'Alexander'];


function findLongName(arr) {
  
  let longName = arr.reduce((el,current)=>{
     return el.length > current.length ? el : current
  },'')
  return longName
}


console.log(findLongName(names));// Дан массив имен.
// Найдите самое длинное имя, если таких имен несколько - выведи любое их них
