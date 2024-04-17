A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())
result = 0
if A < 0:
    result = abs(A) * C  + abs(B)*E + D
else:
    result = (B - A) * E
print(result)

