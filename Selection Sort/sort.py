import random

def findSmallest(arr):
    smallest = arr[0]
    smallestIndex = 0
    
    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallestIndex = i
    return smallestIndex

def selectionSort(arr):
    newArr = []
    for _ in range(len(arr)):
        smallestIndex = findSmallest(arr)
        newArr.append(arr.pop(smallestIndex))
    return newArr

myList = []

for _ in range(50):
    num = random.randint(1, 1000)
    myList.append(num)

print(f"Original list: {myList}")
sortedList = selectionSort(myList.copy())  
print(f"Sorted list: {sortedList}")

