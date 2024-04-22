N, M = map(int, input().split(" "))
first = []
second = []
for i in range(1, N+1):
    first.insert(int(input()) - 1, i)
for i in first[M-1::-1]:
    second.insert(int(input()) - 1, i)
print(second[0], second[1], second[2], sep="\n")