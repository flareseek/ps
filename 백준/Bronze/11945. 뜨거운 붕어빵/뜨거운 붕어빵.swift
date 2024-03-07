let i = readLine()!.split(separator: " ").map{Int($0)!}
for _ in 0..<i[0] {
    print(String(readLine()!.reversed()))
}
