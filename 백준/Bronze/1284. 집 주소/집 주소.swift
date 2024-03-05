var str = readLine()!

while str != "0" {
    var r = 0
    for s in str {
        let c = Int(String(s))!
        if c == 1 {
            r += 2
        } else if c == 0 {
            r += 4
        } else {
            r += 3
        }
    }
    let d = str.count-1
    print(2 + d + r)
    str = readLine()!
}
