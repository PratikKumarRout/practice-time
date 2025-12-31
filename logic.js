// challenge 1
let isRunning = true;

const task = (name, ms) => new Promise(
    res => {
        setTimeout(() => {
            if (isRunning) {
                console.log(`${name} completed ! in ${ms}s`);
                res();
            }
        }, ms * 1000);
    }
);

async function startSystem() {
    console.log("system started...");

    task("task 1", 1);
    task("task 2", 4);

    setTimeout(() => {
        console.log("cancel button pressed.");
        isRunning = false;
    }, 2000);
}

startSystem();