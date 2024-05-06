input()
A = set((map(int, input().split())))
B = set(list(map(int, input().split())))
print(len(A.difference(B))+len(B.difference(A)))