let n = Int(readLine()!)!
print((readLine()!).split(separator: " ").map{(v) -> Int in Int(v)!}.filter { $0 == n }.count)
