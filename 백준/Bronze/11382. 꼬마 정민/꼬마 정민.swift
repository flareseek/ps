let sum = readLine()!.split(separator: " ").reduce(0,  {(acc, cur) in acc + Int(cur)! })
print(sum)
