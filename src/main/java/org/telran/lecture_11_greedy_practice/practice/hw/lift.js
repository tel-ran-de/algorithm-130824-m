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


class Elevator {
    constructor(name, floor, speed) {
      this.name = name; 
      this.floor = floor; 
      this.speed = speed; // 
    }
  
    getTime(target) {
      return Math.abs(this.floor - target) * this.speed;
    }
  }
  
   function choiceElevator(target, elevators) {
    let minTime = Infinity; // заглушка
    let bestElevator = null;
  
    elevators.forEach(elevator => {
      const time = elevator.getTime(target);
      if (time < minTime) {
        minTime = time;
        bestElevator = elevator;
      }
    });
  
    return bestElevator.name;
}
  
const elevatorA = new Elevator('Лифт А', 6, 3); 
const elevatorB = new Elevator('Лифт В', 8, 2); 
const elevatorC = new Elevator('Лифт С', 11, 2); 
  
const elevators = [elevatorA, elevatorB, elevatorC];
  
const floor = 2;
const bestOption = choiceElevator(floor, elevators);
  
console.log(`Оптимальный вариант - ${bestOption}`); 
