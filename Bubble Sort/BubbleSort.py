def bubble_sort(arr):
    arr_length = len(arr)

    for i in range(arr_length - 1):
        for j in range(arr_length - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

if __name__ == "__main__":
    array = [5, 1, 11, 0, 2, 15, 4, 3, 9]
    bubble_sort(array)

    print("Sorted Array:", array)
