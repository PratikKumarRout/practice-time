// challenge 1
const p = Promise.resolve("success");

(async () => {
    const res = await p;
    console.log(res);
})();

p.then(res => console.log(`Then: ${res}`));