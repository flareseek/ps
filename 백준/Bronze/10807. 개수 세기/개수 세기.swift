readLine()
let numbers = (readLine()!).split(separator: " ")
let number = Int(readLine()!)!
var count = 0;
for n in numbers {
    let t = Int(n)!
    if t == number {
        count += 1
    }
}
print(count)
