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

# 다른 풀이
quad = [(3,2),(4,1)]
return quad[dot[0] > 0][dot[1] > 0]
# 1. quad라는 이름의 리스트 정의
# 2-1. quad[dot[0] > 0] : dot[0]이 0보다 크면 True, 아니면 False
# 2-2. quad[dot[1] > 0] : dot[1]이 0보다 크면 True, 아니면 False
# 3. quad 리스트에서 선택된 요소 반환
    # - 예시) dot = [2, 3]일 경우   -> quad[1][1] -> 1 사분면
    # - 예시) dot = [-2, 3]일 경우  -> quad[0][1] -> 2 사분면
    # - 예시) dot = [-2, -2]일 경우 -> quad[0][0] -> 3 사분면
    # - 예시) dot = [2, -3]일 경우  -> quad[1][0] -> 4 사분면

# 다른 풀이
a, b = 1, 0
if dot[0]*dot[1] > 0:
    b = 1
if dot[1] < 0:
    a = 2
return 2*a-b

# 다른 풀이
x , y = dot
if x*y > 0:
    return 1 if x>0 else 3
else:
    return 4 if x>0 else 2
