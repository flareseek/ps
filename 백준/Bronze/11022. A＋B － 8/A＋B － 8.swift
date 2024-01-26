let r = Int(readLine()!)!
for i in 1...r {
    let numbers = readLine()!.split(separator: " ").map({(s) in Int(s)!})
    print("Case #\(i): \(numbers[0]) + \(numbers[1]) = \(numbers[0] + numbers[1])")
}
