// У вас есть список людей, которым нужно подарить подарки.
// У каждого человека есть предпочтения по подаркам, выраженные в виде списка желаемых подарков.
// Каждый подарок можно подарить только одному человеку. Ваша задача - осчастливить как можно больше людей.

// people = {
//     "Alex": ["clock", "notebook", "card"],
//     "Maria": ["clock", "phone"],
//     "Mike": ["card", "bike"],
//     "Anna": ["auto"],
// }
//
// gifts = ["clock", "apple", "card", "bike"]

// Алгоритм
// 1. Выбираем людей, у которых есть в списке данный подарок
// 2. Выбираем человека, у которого меньше предпочтений

const people = [
    {
        name: 'Oleg',
        preferences: ['laptop', 'headphones', 'book', 'coffee maker'],
    },
    {
        name: 'Anna',
        preferences: ['phone', 'gaming console'],
    },
    {
        name: 'Ivan',
        preferences: ['book', 'bike'],
    },
    {
        name: 'Roman',
        preferences: ['book'],
    },
    {
        name: 'Anton',
        preferences: ['phone'],
    },
];

const fnForPeoplesGift = (people) => {
    const schonGeschenkteGifts = []; // которые уже подарили
    const personWhoDenGiftErhalten = []; // люди которые получили подарки

    let peopleCopy = [...people]
    peopleCopy.sort((a, b) => {});

    peopleCopy.forEach((person) => {
        for (let gift of person.preferences) {
            if (!schonGeschenkteGifts.includes(gift)) {
                schonGeschenkteGifts.push(gift);
                personWhoDenGiftErhalten.push({
                    ImyaCheloweka: person.name,
                    podarok: gift,
                });
                break;
            }
        }
    });

    return personWhoDenGiftErhalten;
};

console.log(fnForPeoplesGift(people));