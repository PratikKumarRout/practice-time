// challenge 1
const letter = (string) => {
    const freqMap = new Map();

    for (const char of string) {
        const currentCount = freqMap.get(char) || 0;

        freqMap.set(char, currentCount + 1);
    }
    return freqMap;
};

console.log(letter("Hell00000hhhheeeeeooooooo"));
