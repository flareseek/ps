n = input()
if len(n) == 3:
    if n[1] == '0':
        print(int(n[:2]) + int(n[2]))
    else:
        print(int(n[0]) + int(n[1:3]))
elif len(n) == 4:
    print(int(n[:2]) + int(n[2:4]))
else:
    print(int(n[:1]) + int(n[1]))