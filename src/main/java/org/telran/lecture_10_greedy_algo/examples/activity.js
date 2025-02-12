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
    allActivities.sort((a, b) => a.finish - b.finish);
    let selectedActivities = [allActivities[0]]
    let currentEndTime = allActivities[0].finish;
    for (let i = 1; i < allActivities.length; i++) {
        if (allActivities[i].start >= currentEndTime) {
            currentEndTime = allActivities[i].finish;
            selectedActivities.push(allActivities[i]);
        }
    }
    return selectedActivities;
}



console.log(selectActivities(activities));