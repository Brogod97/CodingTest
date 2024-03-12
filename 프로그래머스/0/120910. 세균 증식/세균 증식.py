def solution(n, t):
    answer = n
    i = 0
    
    while(i < t):
        answer = answer * 2
        i += 1
        
    return answer