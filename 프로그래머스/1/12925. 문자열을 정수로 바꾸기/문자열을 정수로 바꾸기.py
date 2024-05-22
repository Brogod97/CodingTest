def solution(s):
    return int(s)

# 다른 풀이
result = 0
for idx, number in enumerate(str[::-1]):
    if number == '-':
        result *= -1
    else:
        result += int(number) * (10 ** idx)
return result
