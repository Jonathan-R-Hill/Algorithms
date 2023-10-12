function findSmallest(arr) {
    let smallest = arr[0];
    let smallestIndex = 0;
    
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
            smallestIndex = i;
        }
    }
    return smallestIndex;
}

function selectionSort(arr) {
    let newArr = [];
    const len = arr.length;
    for (let i = 0; i < len; i++) {
        let smallestIndex = findSmallest(arr);
        newArr.push(arr.splice(smallestIndex, 1)[0]);
    }
    return newArr;
}

let myList = [];

for (let i = 0; i < 50; i++) {
    let num = Math.floor(Math.random() * 1000) + 1;
    myList.push(num);
}

console.log("Original list:");
console.log(myList);
let sortedList = selectionSort([...myList]);  // Make a copy of the original list to preserve the original order
console.log("Sorted list:");
console.log(sortedList);
