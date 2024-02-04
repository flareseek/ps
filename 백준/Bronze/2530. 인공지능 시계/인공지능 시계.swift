var input1 = (readLine()!).split(separator: " ").map({(v) in Int(v)!})
var input2 = Int(readLine()!)!

var sec = (input1[0] * 60 * 60) + (input1[1] * 60) + (input1[2]) + input2
input1[0] = (sec/(60*60)) % 24
input1[1] = (sec%(60*60) / 60) % 60
input1[2] = (sec%(60*60) % 60) % 60

print("\(input1[0]) \(input1[1]) \(input1[2])")
