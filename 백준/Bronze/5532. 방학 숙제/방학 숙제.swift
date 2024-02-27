let L = Int(readLine()!)!
let A = Int(readLine()!)!
let B = Int(readLine()!)!
let C = Int(readLine()!)!
let D = Int(readLine()!)!
let e = max((A-1)/C, (B-1)/D)+1
print(L-e > 0 ? L-e : 0)
