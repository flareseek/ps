n = int(input())

for _ in range(n):
    str = input()
    t = -1
    for s in str:
        if s == t:
            continue
        else:
            print(s, end='')
            t = s
    print()
