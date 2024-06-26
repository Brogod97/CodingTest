def solution(n):
    answer = []
    
    while n != 1:
        answer.append(n)
        
        if n % 2 == 0:
            n = n / 2
        else:
            n = 3 * n + 1
        if n == 1:
            answer.append(1)
    
    return answer

# 다른 풀이
 while n > 1:
    if n % 2 == 0:
        n //= 2
    else:
        n = 3 * n + 1
    answer.append(n)
return answer
