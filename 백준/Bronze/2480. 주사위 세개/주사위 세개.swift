var cnt = 0;
let input = (readLine()!).split(separator: " ").map({(v) in Int(v)!})

if (input[0] == input[1]) {
    cnt += 1
}
if (input[0] == input[2]) {
    cnt += 1
}
if (cnt == 2) {
    print(10000 + (input[0] * 1000))
} else if (cnt == 1) {
    print(1000+(input[0] * 100))
} else if (input[1] == input[2]) {
    print(1000+(input[1] * 100))
} else {
    print(input.sorted()[2] * 100)
}
