input()
M = list(map(int, input().split()))
for i in M:
    if i < 250:
        print("4", end=" ")
    elif i < 275:
        print("3", end=" ")
    elif i < 300:
        print("2", end=" ")
    else:
        print("1", end=" ")