n = input()
if "7" in n:
    if not int(n)%7:
        print(3)
    else:
        print(2)
else:
    if not int(n)%7:
        print(1)
    else:
        print(0)