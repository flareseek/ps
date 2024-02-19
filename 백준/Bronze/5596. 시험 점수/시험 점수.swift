func a(str: String) -> Int {
    return str.split(separator: " ").map({v in Int(v)!}).reduce(0, {(a, c) in a+c})
}
let b = a(str:readLine()!)
let c = a(str:readLine()!)

if (b >= c) {
    print(b)
} else {
    print(c)
}
