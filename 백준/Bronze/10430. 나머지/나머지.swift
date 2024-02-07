let numbers = (readLine()!).split(separator: " ").map({(v) -> Int in Int(v)!})
let A = (numbers[0] + numbers[1]) % numbers[2]
let B = (numbers[0] * numbers[1]) % numbers[2]
print("\(A)\n\(A)\n\(B)\n\(B)")
