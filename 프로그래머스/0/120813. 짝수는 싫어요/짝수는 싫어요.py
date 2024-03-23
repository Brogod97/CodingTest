def solution(n):
    answer = []
    
    for i in range(1, n + 1):
        if(i % 2 == 1):
            answer.append(i)
    
    return answer

// 다른 풀이
return [i for i in range(1, n+1, 2)]

// 다른 풀이
return [x for x in range(n + 1) if x % 2]
