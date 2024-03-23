let n = Int(readLine()!)!

for _ in 0..<n {
    let i = Int(readLine()!)!
    print("\(i) is \(i%2==0 ? "even" : "odd")")
}
