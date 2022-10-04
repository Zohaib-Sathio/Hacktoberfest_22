def bubbleSort(arr):
    n = len(arr)

    swap = False

    for i in range(n-1):
        for j in range(0, n-i-1):

            if arr[j] > arr[j + 1]:
                swap = True
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
         
        if not swap:
            return
 
 
#test
arr = [60, 30, 25, 2, 20, 10, 90]
 
bubbleSort(arr)
 
print(arr)
