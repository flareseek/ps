let i = readLine()!.split(separator: " ").map{Int($0)!}
print(((i[0]-1)/i[2]+1) * ((i[1]-1)/i[2]+1))
