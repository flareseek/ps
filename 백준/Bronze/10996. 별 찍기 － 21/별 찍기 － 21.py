n = int(input())

for i in range(n):
    for _ in range(n//2 + n%2):
        print("*", end=" ")
    print()
    for _ in range(n//2):
        print(" *", end="")
    print()