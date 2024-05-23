def solution(numbers):
    
    return 45 - sum(numbers)

# 다른 풀이
return sum([i for i in [1,2,3,4,5,6,7,8,9,0] if i not in numbers])

# 다른 풀이
answer=0
for i in range(1,10):
    if i not in numbers:
        answer += i
return answer

# 다른 풀이
return sum(set(range(10)) - set(numbers))
