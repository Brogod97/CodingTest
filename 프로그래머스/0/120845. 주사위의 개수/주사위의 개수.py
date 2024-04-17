def solution(box, n):
    answer = 1
    
    for side in box:
        answer *= side // n
    
    return answer

# 다른 풀이
x, y, z = box
return (x // n) * (y // n) * (z // n )

# 다른 풀이
return math.prod(map(lambda v: v//n, box)) # import math

# 다른 풀이
return (box[0] // n) * (box[1] // n) * (box[2] // n)
