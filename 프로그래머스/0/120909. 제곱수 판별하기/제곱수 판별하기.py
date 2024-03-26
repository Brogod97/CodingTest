import math

def solution(n):    
    
    return 1 if math.sqrt(n) % 1 == 0 else 2

# 다른 풀이
return 1 if (n ** 0.5).is_integer() else 2
# .is_integer() : 정수면 true, 아니면 false

# 다른 풀이
if n**(1/2) == int(n**(1/2)) :
    return 1
else :
    return 2
