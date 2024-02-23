var h = 2000
var b = 2000
for _ in 1...3 {
    let i = Int(readLine()!)!
    h = i < h ? i : h
}
for _ in 1...2 {
    let i = Int(readLine()!)!
    b = i < b ? i : b
}
print(h+b-50)
