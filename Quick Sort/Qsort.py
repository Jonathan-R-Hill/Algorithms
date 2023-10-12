
def quickSort(arr):
    if len(arr) < 2:
        return arr
    else:
        pivot = arr[0]
        
        less = [i for i in arr[1:] if i <= pivot]
        greater = [i for i in arr[1:] if i > pivot]
        
        return quickSort(less) + [pivot] + quickSort(greater)

print(quickSort([9,2,1,5,3,2,7,9,10,2,3]))
