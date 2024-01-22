var str = readLine()!
while(str != "0 0") {
    let numbers = str.split(separator: " ")
    let n1: Int = Int(numbers[0])!
    let n2: Int = Int(numbers[1])!
    if n1 > n2 {
        print("Yes")
    } else {
        print("No")
    }
    str = readLine()!
}
