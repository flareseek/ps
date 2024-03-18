let i = readLine()!.split(separator: " ").map{Int($0)!}
print("\(i[2]/i[1]) \(i[2]%i[1])")
