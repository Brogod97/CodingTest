def solution(strArr):
    answer = []
    idx = 0
    
    for str in strArr:
        if idx % 2 == 0:
            answer.append(str.lower())
        else:
            answer.append(str.upper())
        idx += 1
    
    return answer