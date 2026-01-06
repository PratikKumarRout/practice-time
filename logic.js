// challenge 1
const arr = [9, 8, 1, 2, 3, 3, 4, 5, 10, 5, , 5];

const removeDuplicate = (arr) => [...new Set(arr.filter(Boolean))];
console.log(removeDuplicate(arr.sort((a, b) => a - b)));

