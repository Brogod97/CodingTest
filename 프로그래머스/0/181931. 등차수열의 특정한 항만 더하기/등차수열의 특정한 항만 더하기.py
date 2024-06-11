def solution(a, d, included):
    answer = 0
    
    for i, include in enumerate(included):
        if include :
            answer += a + d * i
    
    return answer