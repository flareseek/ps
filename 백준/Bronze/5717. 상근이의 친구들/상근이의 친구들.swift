var str = readLine()!
while str != "0 0" {
    print(str.split(separator: " ").map({ (v) in Int(v)!}).reduce(0, { (r, c) in r+c}))
    str = readLine()!
}
