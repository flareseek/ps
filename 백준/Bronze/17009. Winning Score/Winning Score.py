a = int(input()) * 3
a += int(input()) * 2
a += int(input())
b = int(input()) * 3
b += int(input()) * 2
b += int(input())

print("A" if a > b else "B" if b > a else "T")