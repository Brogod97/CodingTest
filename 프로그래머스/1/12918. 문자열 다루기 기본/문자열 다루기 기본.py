def solution(s):
    return s.isdigit() and (len(s) == 4 or len(s) == 6)
# isdigit(): 문자열이 숫자로만 이루어져 있는지 확인


# 다른 풀이
return s.isdigit() and len(s) in [4,6]

# 다른 풀이
try:
    int(s)
except:
    return False
return len(s) == 4 or len(s) == 6

