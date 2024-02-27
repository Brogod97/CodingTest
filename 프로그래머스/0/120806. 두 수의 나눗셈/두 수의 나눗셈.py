import math 

def solution(num1, num2):
    return math.trunc(num1 / num2 * 1000)

# math.trunc(숫자)
# 반올림 하지 않고, 소수 부분만 제거
# 숫자 아니면, TypeError 발생