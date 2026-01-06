// for of loop is for array, strings, sets, maps gets the values directly
const colors = ["red", "green", "blue", 1, 2, 3, 3, "blue", "yellow"];
for (const color of colors) {
    console.log(color);
}
console.log(colors.sort());
const nodups = new Set(colors);
console.log(nodups);

// for each loop is a functional style, good for doing something to every item
colors.forEach((color, index) => {
    console.log(`${index}: ${color}`);
});

// for in loop is for objects , gets the key
const car = { brand: "Tesla", model: "x" };
for (const key in car) {
    console.log(key, car[key]);

}