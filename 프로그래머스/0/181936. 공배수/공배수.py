def solution(number, n, m):
    
    return 1 if number % n == 0 and number % m == 0 else 0

# 다른 풀이
return int(bool(number % n == 0) & bool(number % m == 0))
