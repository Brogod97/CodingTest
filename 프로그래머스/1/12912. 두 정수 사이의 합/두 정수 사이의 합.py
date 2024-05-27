def solution(a, b):
    
    return sum([i for i in range(a, b + 1)] if a < b else [i for i in range(b, a + 1)])

# 다른 풀이
if a > b:
    a, b = b, a
return sum(range(a, b + 1))

# 다른 풀이
return (abs(a-b)+1)*(a+b)//2

# 다른 풀이
return sum(range(min(a, b), max(a, b)+1))
