A, B, C = input().split(" ")

if A == B and B == C:
    print("*")
elif A == B and B != C:
    print("C")
elif A != B and B == C:
    print("A")
else:
    print("B")