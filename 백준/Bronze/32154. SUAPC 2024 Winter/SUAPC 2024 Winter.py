arr = [
    [1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 13],
    [1, 3, 5, 6, 7, 8, 9, 12, 13],
    [1, 3, 5, 6, 7, 8, 9, 12, 13],
    [1, 2, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 2, 3, 6, 7, 8, 12, 13]
]
n = int(input())
print(len(arr[n - 1]))
print(" ".join([chr(arr[n - 1][i] + 64) for i in range(len(arr[n - 1]))]))