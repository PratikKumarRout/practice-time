// challenge 1
const cart = [
    { name: "Laptop", price: 1200, category: "Electronics", inStock: true },
    { name: "Mouse", price: 25, category: "Electronics", inStock: true },
    { name: "Keyboard", price: 75, category: "Electronics", inStock: false },
    { name: "Notebook", price: 10, category: "Stationery", inStock: true }
];

const totalPrice = cart.reduce((total, item) => total + item.price, 100);

console.log(totalPrice);

const reverseNames = cart.reduceRight((acc, item) => acc + item.name + " ", " + ");

console.log(reverseNames);
