d, n = map(int, input().split())
t = []
for _ in range(d):
    t.append(int(input()))
tt = n//sum(t)
for e in t:
    print(tt*e)