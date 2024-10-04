def solution(seoul):
    for i in range(0, len(seoul)):
        if seoul[i] == "Kim":
            return f"김서방은 {i}에 있다"
