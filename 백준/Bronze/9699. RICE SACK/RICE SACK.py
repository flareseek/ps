n = int(input())
for i in range(1, n+1):
    t = list(map(int, input().split()))
    t.sort(reverse=True)
    print(f"Case #{i}: {t[0]}")