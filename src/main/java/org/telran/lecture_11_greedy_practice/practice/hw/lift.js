// Задача: вызов лифта
// В доме n лифтов, у каждого лифта своя скорость, измеряемая в сек/этаж (секунд на один этаж).
// Реализовать алгоритм отправки лифта, который приедет быстрее всего.
// Алгоритм будет применяться в домах разной этажности.
// Алгоритм будет применяться в домах с количеством > 2 лифтов
// Пример:
//  в доме 19 этажей
//  работают лифт А, лифт В и лифт C
//  лифт А находится на 4 этаже и движется со скоростью 3 сек/этаж.
//  лифт В находится на 8 этаже и движется со скоростью 2 сек/этаж.
//  лифт C находится на 5 этаже и движется со скоростью 2 сек/этаж.
//  На вход: 1 (вызываем на первый этаж)
//  результат: отправляем лифт С

const elevators = [
   { name: "lift_A", floor: 4, speed: 3 },
   { name: "lift_B", floor: 8, speed: 2 },
   { name: "lift_C", floor: 5, speed: 2},
]
const needFloor = 1;

function findFastElevator(elevators, needFloor) {
let fastElevator = null;
let minTime = Infinity;

   elevators.forEach(elevators => {
      const { name, floor, speed } = elevators;
      const time = (floor - needFloor) * speed;

      if (time < minTime) {
         minTime = time;
         fastElevator = name;
      }
   });
   return `${fastElevator}`;
}

console.log(findFastElevator(elevators, needFloor));
