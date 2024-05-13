def solution(order):
    answer = 0
    
    for o in order:
        if o.find("cafelatte") == -1:
            answer += 4500
        else:
            answer += 5000
    
    return answer