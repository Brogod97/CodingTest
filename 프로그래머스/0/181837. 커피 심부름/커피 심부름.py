def solution(order):
    answer = 0
    
    for o in order:
        if o.find("cafelatte") == -1:
            answer += 4500
        else:
            answer += 5000
    
    return answer

# 다른 풀이
answer = 0
for want in order:
    if 'latte' in want:
        answer += 500
    answer += 4500

return answer

# 다른 풀이
return sum([5000 if "cafelatte" in i else 4500 for i in order])
