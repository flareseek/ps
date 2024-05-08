n = list(map(int, input().split()))
N = n[-1]
n = n[:-1]

result = N*len(n) - sum(n)
print(max(0, result))
