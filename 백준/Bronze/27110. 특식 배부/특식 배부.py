N = int(input())
A, B, C = map(int, input().split(" "))
print((N if A >= N else A) + (N if B >= N else B) + (N if C >= N else C))