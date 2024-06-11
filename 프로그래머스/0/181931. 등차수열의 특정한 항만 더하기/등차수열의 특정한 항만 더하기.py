def solution(a, d, included):
    answer = 0
    
    for i, include in enumerate(included):
        if include :
            answer += a + d * i
    
    return answer
    
# 다른 풀이
answer = 0
for i in range(len(included)):
    answer += (a + d * i) * int(included[i])
return answer

# 다른 풀이
return sum(a + i * d for i, f in enumerate(included) if f)
