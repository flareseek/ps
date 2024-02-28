let a = Int(readLine()!)!
let b = Int(readLine()!)!
let c = Int(readLine()!)!

if a+b+c != 180 {
    print("Error")
} else if a == b && b == c {
    print("Equilateral")
} else if a == b || b == c || a == c {
    print("Isosceles")
} else {
    print("Scalene")
}
