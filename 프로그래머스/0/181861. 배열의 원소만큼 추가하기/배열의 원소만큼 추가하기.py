def solution(arr):
    answer = []
    
    for i in arr:
        for j in range(0, i):
            answer.append(i)
    
    return answer

# 다른 풀이
return [i for i in arr for j in range(i)]

# 다른 풀이
answer = []
for num in arr:
    answer.extend([n]*n)
return answer
