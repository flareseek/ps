let i = readLine()!.split(separator: " ").map{Int($0)!}.reduce(0){$0 + $1}
let i2 = Int(readLine()!)! * 2
if i >= i2 {
    print(i-i2)
} else {
    print(i)
}
