a, b, c, d = map(int, input().split())
r1 = a * b
r2 = c * d
print("M" if r1 > r2 else "P" if r1 < r2 else "E")