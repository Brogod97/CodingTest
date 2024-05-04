def solution(order):
    answer = 0
    
    for num in str(order):
        if num == '3' or num == '6' or num == '9':
            answer += 1
    
    return answer

# 다른 풀이
return sum(map(lambda x: str(order).count(str(x)), [3, 6, 9]))

# 다른 풀이
answer = 0
order = str(order)
return order.count('3') + order.count('6') + order.count('9')

# 다른 풀이
answer = len([1 for ch in str(order) if ch in "369"])
