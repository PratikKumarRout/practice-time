// for of loop is for array, strings, sets, maps gets the values directly
const colors = ["red", "green", "blue"];
for (const color of colors) {
    console.log(color);
}

// for each loop is a functional style, good for doing something to every item
colors.forEach((color, index) => {
    console.log(`${index}: ${color}`);
});

// for in loop is for objects   