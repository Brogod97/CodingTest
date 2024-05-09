def solution(number):
    
    return sum([int(x) for x in list(number)]) % 9

# 다른 풀이
return sum(map(int, number)) % 9 # map() -> list 반환
