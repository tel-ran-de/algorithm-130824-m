/** ДРОБНЫЙ РЮКЗАК */

const weight = [10, 20, 30];
const value = [60, 100, 120];
const totalSpace = 50;

function fillFractionalKnapsack(weight, value, capacity) {
    let items = []
    for (let i = 0; i < weight.length; i++) {
        items.push({weight: weight[i], value: value[i], cost: value[i]/weight[i]});
    }
    // sorting items by cost;
    items.sort((a, b) => b.cost - a.cost);

    let totalValue = 0;
    let bag = []

    for (let j = 0; j < items.length; j++) {
        let item = items[j];
        let curWeight = item.weight;
        let curValue = item.value;

        if (capacity - curWeight >= 0) {
            // this weight can be picked while
            capacity = capacity - curWeight;
            totalValue += curValue;
            item.fraction = curWeight;
            bag[j] = item;
        } else {
            // item cant be picked whole
            let fraction = curWeight - (curWeight - capacity);
            totalValue += (item.cost * fraction);
            item.fraction = fraction;
            bag[j] = item;
            break;
        }
    }
    console.log(bag);
    console.log(totalValue);
    return totalValue;
}

fillFractionalKnapsack(weight, value, totalSpace);
