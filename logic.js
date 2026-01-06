// challenge 1
const arr = [9, 8, 1, 2, 3, 3, 4, 5, 10, 5, , 5];

const removeDuplicate = (arr) => [...new Set(arr.filter(Boolean))];
console.log(removeDuplicate(arr.sort((a, b) => a - b)));

// challenge 2
const isAnagram = (str1, str2) => {

    if (str1.length !== str2.length) return false;

    const count = {};

    for (let char of str1.toLowerCase()) {
        count[char] = (count[char] || 0) + 1;
    }

    for (let char of str2.toLowerCase()) {
        if (!count[char]) return false;
        count[char]--;
    }

    return true;
};

console.log(isAnagram("Hello", "bello"));
console.log(isAnagram("listen", "Silent"));
