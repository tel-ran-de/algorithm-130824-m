// В магазине продают только по три и по пять воздушных шариков.
// Можно ли купить ровно k шариков?

// Пример 1:
// Input: 8
// Output: Yes
// Пояснение: Можно купить 5 + 3 шарика

// Пример 2:
// Input: 10
// Output: Yes
// Пояснение: Можно купить 5 + 5 шариков

// Пример 3:
// Input: 7
// Output: No
// Пояснение: Никакими комбинациями 5 и 3, 7 шариков купить невозможно
let k=0;
function canBuyBalloons(k) {
    if (k!==1 && k!==2 && k!==4 && k!==7){
       return true;
    }
    return false;
  }

  // Примеры
  console.log(canBuyBalloons(8));  
  console.log(canBuyBalloons(10)); 
  console.log(canBuyBalloons(7));  
