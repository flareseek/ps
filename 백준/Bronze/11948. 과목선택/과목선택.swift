var s: [Int] = [Int](repeating: 0, count: 4)
for i in 0..<4 {
    s[i] = Int(readLine()!)!
}
s.sort()
var ss: [Int] = [Int(readLine()!)!, Int(readLine()!)!]
ss.sort()
print(s[3]+s[2]+s[1]+ss[1])
