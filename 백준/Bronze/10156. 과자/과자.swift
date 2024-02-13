let input = (readLine()!).split(separator: " ").map({ (v) -> Int in Int(v)! })
let p = input[0] * input[1]
let r = p - input[2]
print(r<0 ? 0 : r)
