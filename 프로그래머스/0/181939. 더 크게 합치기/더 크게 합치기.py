def solution(a, b):
    
    return max(int(str(a) + str(b)), int(str(b) + str(a)))

# 다른 풀이
return max(int(f"{a}{b}"), int(f"{b}{a}")))
