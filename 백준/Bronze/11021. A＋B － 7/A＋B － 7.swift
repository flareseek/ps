let r = Int(readLine()!)!
for i in 1...r {
    let sum = (readLine()!).split(separator: " ").reduce(0, {(acc, cur) in acc + Int(cur)!})
    print("Case #\(i): \(sum)")
}
