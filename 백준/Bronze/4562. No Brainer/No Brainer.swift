let n = Int(readLine()!)!
for _ in 1...n {
    let i = readLine()!.split(separator: " ").map{v in Int(v)!}
    print(i[0] < i[1] ? "NO BRAINS" : "MMM BRAINS")
}
