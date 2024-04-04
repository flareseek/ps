n = int(input())
for _ in range(n):
    [nn, uu] = input().split(" ")
    nn = int(nn) if nn.isdecimal() else float(nn)
    if uu == "kg":
        print("{:.4f} lb".format(nn * 2.2046))
    elif uu == "lb":
        print("{:.4f} kg".format(nn * 0.4536))
    elif uu == "l":
        print("{:.4f} g".format(nn * 0.2642))
    else:
        print("{:.4f} l".format(nn * 3.7854))