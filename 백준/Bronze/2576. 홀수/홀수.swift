var input: [Int] = []
for _ in 0..<7 {
    let n = Int(readLine()!)!
    if n%2 == 1 {
        input.append(n)
    }
}
if input.count == 0 {
    print(-1)
} else {
    print(
        input.reduce(0){
            $0+$1
        }
    )
    print(input.sorted()[0])
}
