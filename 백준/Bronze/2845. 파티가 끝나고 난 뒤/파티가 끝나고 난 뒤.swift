let i = readLine()!.split(separator: " ").map({Int($0)!}).reduce(1, {$0 * $1})
readLine()!.split(separator: " ").forEach{ print(Int($0)! - i, terminator: " ") }
