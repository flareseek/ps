let ap: [Character] = ["a", "e", "i", "o", "u"]
var cnt = 0
(readLine()!).forEach{
    (v) in 
    if ap.contains(v) {
        cnt += 1
    }
}
print(cnt)

