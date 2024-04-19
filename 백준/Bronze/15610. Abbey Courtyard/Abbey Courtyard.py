import math
a = str(math.sqrt(int(input())) * 4)
a = a if len(a) <= 12 else a[:12]
print(a)