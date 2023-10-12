
const search = (array, number) => {
    
    let low = 0;
    let high = array.length - 1;
    let guessToX = "";

    while (low <= high) {
        let mid = Math.floor((high + low) / 2); 
        let guess = array[mid];

        if (guess === number) {
            return mid;
        } else if (guess > number) {
            high = mid - 1;
            guessToX = "Too high";
        } else {
            low = mid + 1;
            guessToX = "Too low";
        }
        console.log(`Current guess is ${guess} and is ${guessToX}`);
    }
    return null;
}

let myList = Array.from({ length: 10100 }, (_, index) => index);

console.log(search(myList, 44));
