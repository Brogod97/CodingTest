def solution(a, b):

    ab = int(str(a) + str(b))
    ab2 = 2 * a * b
    
    return max(ab, ab2)

# 다른 풀이
return int(str(a) + str(b)) if int(str(a) + str(b)) > 2*a*b else 2*a*b
