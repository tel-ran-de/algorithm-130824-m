activities = [
    {name: 'drawing', start: 10, finish: 13},
    {name: 'writing', start: 10, finish: 17},
    {name: 'eating', start: 12, finish: 14},
    {name: 'coding', start: 15, finish: 19},
    {name: 'reading', start: 13, finish: 16},
    {name: 'dancing', start: 17, finish: 18}
]

function selectActivities(allActivities) {
    // TODO: проанализируйте код функции и найдите недостатки реализации
    //  Подсказка: побочные эффекты

    // copyActivities = allActivities.splice(0, allActivities.length);
    copyActivities = [...allActivities];
    copyActivities.sort((a, b) => a.finish - b.finish);
    let selectedActivities = [copyActivities[0]]
    let currentEndTime = copyActivities[0].finish;
    for (let i = 1; i < copyActivities.length; i++) {
        if (copyActivities[i].start >= currentEndTime) {
            currentEndTime = copyActivities[i].finish;
            selectedActivities.push(copyActivities[i]);
        }
    }
    return selectedActivities;
}


console.log(activities);
res = selectActivities(activities);
console.log("------------------");
console.log(activities);