let str = (readLine()!).split(separator: "-")
print(str.reduce("", {(Result, Substring) -> String in "\(Result)\(Substring[Substring.startIndex])"}))
