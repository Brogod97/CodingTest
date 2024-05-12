def solution(numLog):
    answer = ''
    prev = numLog[0]
    
    for curr in numLog:
        if curr - prev == 1: answer += 'w'
        if curr - prev == -1: answer += 's'
        if curr - prev == 10: answer += 'd'
        if curr - prev == -10: answer += 'a'
        prev = curr
    
    return answer