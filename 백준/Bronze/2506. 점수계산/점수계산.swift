readLine()
var score = 0
let number: Int = readLine()!.split(separator: " ").map{ v in Int(v)! }.reduce(0){ (result: Int, element: Int) -> Int in {
    if element == 0 {
        score = 0
        return result
    }
    score += 1
    return result + score
}()}
print(number)
