// challenge 1
const cars = ["saab", "volvo", "bmw"];

cars.push("Lemon");

const newcar = cars.length;

cars[8] = "mango";

console.log(newcar);

cars.forEach(element => {
    console.log(element);

});