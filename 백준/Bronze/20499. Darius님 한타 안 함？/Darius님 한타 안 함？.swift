let arr = readLine()!.split(separator: "/").map{Int($0)!}
print(arr[0]+arr[2] < arr[1] || arr[1] == 0 ? "hasu" : "gosu")
