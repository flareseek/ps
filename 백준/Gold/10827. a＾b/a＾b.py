from decimal import Decimal, getcontext
a, b = map(Decimal, input().split())
getcontext().prec = 9999
print(f"{a**b:f}")
