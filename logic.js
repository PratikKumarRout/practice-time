// challenge 1
const flipcoin = new Promise((resolve, reject) => {
    const isHeads = Math.random() > 0.5;
    if (isHeads) {
        resolve("victory! it is heads");
    } else {
        reject("Oh no, it is tails.");
    }
});

async function flip() {
    try {
        const fp = await flipcoin;
        console.log(fp);

    } catch (error) {
        console.log(error);
        console.log("ohh no try again.");
        

    }
}

flip();