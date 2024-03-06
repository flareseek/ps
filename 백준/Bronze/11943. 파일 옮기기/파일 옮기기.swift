let i1 = readLine()!.split(separator: " ").map{Int($0)!}
let i2 = readLine()!.split(separator: " ").map{Int($0)!}

print(min(i1[0] + i2[1], i1[1] + i2[0]))
