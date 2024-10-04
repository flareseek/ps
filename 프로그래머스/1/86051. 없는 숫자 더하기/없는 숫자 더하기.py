def solution(numbers):
    sum = 45
    for i in range(0, len(numbers)):
        sum -= numbers[i]
    return sum