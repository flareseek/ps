let r = Int(readLine()!)!
for _ in 0..<r{
    let str = readLine()!
    print("\(str[str.startIndex])\(str[str.index(before: str.endIndex)])")
}
