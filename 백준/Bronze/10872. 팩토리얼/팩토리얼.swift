func f(number: Int) -> Int {
    if number != 0 {
        return number * f(number: number-1)
    }
    return 1
}
print(f(number:Int(readLine()!)!))
