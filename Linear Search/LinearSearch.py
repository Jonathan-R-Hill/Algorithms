
def linear_search(array, target):
    for i in range(len(array)):
        if array[i] == target:
            return i  
    return -1  


if __name__ == "__main__":
    array = [2, 5, 1, 9, 7, 4, 8, 3, 6]
    target = 7

    result = linear_search(array, target)

    if result != -1:
        print("Target found at index:", result)
    else:
        print("Target not found in the array.")
