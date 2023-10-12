const bubbleSort = (array) => {
    const arrLength = array.length;

    for (let i = 0; i < arrLength - 1; i++) {
        for (let j = 0; j < arrLength - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                // Swap elements if they are in the wrong order
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
            }
        }
    }
}

const array = [5, 1, 11, 0, 2, 15, 4, 3, 9];
bubbleSort(array);

console.log("Sorted Array:", array);
