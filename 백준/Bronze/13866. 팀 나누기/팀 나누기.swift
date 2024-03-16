let s = readLine()!.split(separator: " ").map{Int($0)!}
print(abs(s[0]+s[3]-s[1]-s[2]))
