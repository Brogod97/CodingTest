def solution(dot):
    answer = 0
    
    if dot[0] > 0:
        if dot[1] > 0:
            answer = 1
        else:
            answer = 4;
    elif dot[0] < 0:
        if dot[1] > 0:
            answer = 2;
        else:
            answer = 3;
    
    return answer