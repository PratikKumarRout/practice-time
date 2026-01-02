// challenge 1
const cart = [10, 20, 30, 40];

// acc = accumulator (the running total)
// curr = current item in the loop
const total = cart.reduce((acc, cur) => acc + cur, 0);

console.log(total); // Should be 100