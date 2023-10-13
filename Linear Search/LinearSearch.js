const linearSearch = (array, target) => {
    for (let i = 0; i < array.length; i++) {
        if (array[i] === target) {
            return i; 
        }
    }
    return -1;
}


const array = [2, 5, 1, 9, 7, 4, 8, 3, 6];
const target = 7;

const result = linearSearch(array, target);

if (result !== -1) {
    console.log(`Target found at index: ${result}`);
} else {
    console.log("Target not found in the array.");
}
