n = int(input())
for i in range(0, n):
    for _ in range(n-i-1):
        print(end=" ")
    print("*", end="")
    if i == n-1:
        for _ in range((n-1)*2):
            print("*", end="") 
    elif i != 0:
        for _ in range(i*2-1):
            print(end=" ")
        print("*", end="")
    print()