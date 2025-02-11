function ballons_3_5(k) {
  for (let i = 0; i * 5 <= k; i++) {
    if ((k - i * 5) % 3 === 0) {
      return ` Да, вы можете купить ${k} шариков` ;
    }
  }
  return 'NO';
}

console.log(ballons_3_5(12));


