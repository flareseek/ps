let n = Int(readLine()!)!
for _ in 1...n {
    let i = readLine()!.split(separator: " ").map{Int($0)!}
    for _ in 1...i[1] {
        for _ in 1...i[0] {
            print("X", terminator: "")
        }
        print()
    }
    print()
}
