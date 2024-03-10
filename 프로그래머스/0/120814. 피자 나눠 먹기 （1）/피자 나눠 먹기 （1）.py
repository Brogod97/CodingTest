def solution(n):
    return n // 7 + 1 if n % 7 > 0 else n // 7

# 다른 풀이
return (n - 1) // 7 + 1

# 다른 풀이
return math.ceil(n / 7)
