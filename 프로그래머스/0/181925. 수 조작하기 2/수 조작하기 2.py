def solution(numLog):
    answer = ''
    prev = numLog[0]
    
    for curr in numLog:
        # diff = numLog[i] - numLog[i-1] # 이 시점에 값 계산해도 무방 
        
        if curr - prev == 1: answer += 'w'
        if curr - prev == -1: answer += 's'
        if curr - prev == 10: answer += 'd'
        if curr - prev == -10: answer += 'a'
        prev = curr
    
    return answer

# 다른 풀이
res=''
joystick=dict(zip([1,-1,10,-10],['w','s','d','a']))
for i in range(1,len(numLog)):
    res += joystick[numLog[i]-numLog[i-1]]
return res
# zip(iterable1 [, iterable2 [, ...]])
#     - 주어진 iterable(반복 가능한 객체)들로부터 각각 하나씩 요소를 가져와서 튜플로 묶어주는 역할
