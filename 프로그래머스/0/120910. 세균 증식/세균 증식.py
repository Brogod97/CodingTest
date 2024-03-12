def solution(n, t):
    answer = n
    i = 0
    
    while(i < t):
        answer = answer * 2
        i += 1
        
    return answer

# 다른 풀이
return n << t
# 시프트 연산자 : 비트의 위치 이동
# << (왼쪽), >> (오른쪽)

# 다른 풀이
return 2**t * n
# ** : 거듭 제곱 연산자

# 다른 풀이
for i in range(t) :
    n *= 2
