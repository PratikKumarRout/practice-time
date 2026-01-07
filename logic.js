// challenge 1
const flipcoin = new Promise((resolve, reject) => {
    const isHeads = Math.random() > 0.5;
    if (isHeads) {
        resolve("victory! it is heads");
    } else {
        reject("Oh no, it is tails.");
    }
});

flipcoin.then((msg) => console.log(msg))
    .catch((error) => console.log(error));