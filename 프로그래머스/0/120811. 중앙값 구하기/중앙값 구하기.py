def solution(array):
    answer = sorted(array)
    
    return answer[len(array) // 2]

# 다른 풀이
return sorted(array)[len(array) // 2]

