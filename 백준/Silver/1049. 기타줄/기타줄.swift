let i = readLine()!.split(separator: " ").map{Int($0)!}
var m1 = 1000
var m2 = 1000
for _ in 0..<i[1] {
    let i2 = readLine()!.split(separator: " ").map{Int($0)!}
    m1 = min(m1, i2[0])
    m2 = min(m2, i2[1])
}
if (m1 == 0 || m2 == 0) {
    print(0)
} else if (m1 > m2 * 6) {
    print(i[0] * m2)
} else {
    let r = (i[0] / 6) * m1
    let d = i[0] % 6
    if (d == 0) {
        print(r)
    } else {
        let r2 = d >= m1/m2 ? m1 : d*m2
        print(r+r2)
    }
}
