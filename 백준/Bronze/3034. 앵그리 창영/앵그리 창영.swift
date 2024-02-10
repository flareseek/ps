let input = (readLine()!).split(separator: " ").map({(v) -> Int in Int(v)!})
let len = input[1]*input[1] + input[2]*input[2]

for _ in 1...input[0] {
    let n = Int(readLine()!)!
    if n*n <= len {
        print("DA")
    } else {
        print("NE")
    }
}
