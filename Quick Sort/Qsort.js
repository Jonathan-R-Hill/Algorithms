function quickSort(arr) {
    if (arr.length < 2) {
        return arr;
    } else {
        const pivot = arr[0];
        const less = arr.slice(1).filter(item => item <= pivot);
        const greater = arr.slice(1).filter(item => item > pivot);
        return [...quickSort(less), pivot, ...quickSort(greater)];
    }
}

console.log(quickSort([9, 2, 1, 5, 3, 2, 7, 9, 10, 2, 3]));
