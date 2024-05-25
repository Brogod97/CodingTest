def solution(n):
    
    return [i for i in range(1, n + 1) if n % i == 0]

# 다른 풀이
return list(filter(lambda v: n % v == 0, [i for i in range(1, n//2+1)])) + [n]

# 다른 풀이
for i in range(1, n + 1):
    if n % i == 0:
        answer.append(i)
