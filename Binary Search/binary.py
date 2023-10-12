
def search(array, number):
    '''
    Returns the index of the number we are looking for in the given array
    '''
    low = 0
    high = len(array) - 1
    guessToX = ""
    while low <= high:
        mid = ( high + low ) // 2
        guess = array[mid]
        
        if guess == number:
            return mid
        elif guess > number:
            high = mid - 1
            guessToX = "Too high"
        else:
            low = mid + 1
            guessToX = "Too low"
        print(f'Current guess is {guess} and is {guessToX}')
    return None

myList = [num for num in range(0, 10100)]


print(search(myList, 44))
