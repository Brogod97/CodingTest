def solution(absolutes, signs):
    answer = 0
    
    for i, sign in enumerate(signs):
        if sign:
            answer += absolutes[i]
        else:
            answer -= absolutes[i]
            
    return answer

# 다른 풀이
return sum(absolutes if sign else -absolutes for absolutes, sign in zip(absolutes, signs))
# zip(*iterables)
#     - 각 iterable에서 동일한 위치에 있는 요소들을 튜플로 묶어주는 역할
