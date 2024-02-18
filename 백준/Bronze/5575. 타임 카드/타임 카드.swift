func printTime(str: String) {
    let n = str.split(separator: " ").map({(v) in Int(v)!})
    
    let o2 = n[3]*60*60 + n[4]*60 + n[5]
    let o1 = n[0]*60*60 + n[1]*60 + n[2]
    
    let r = o2-o1
    print("\(r/3600) \(r%3600/60) \(r%3600%60)")
}

printTime(str: readLine()!)
printTime(str: readLine()!)
printTime(str: readLine()!)
