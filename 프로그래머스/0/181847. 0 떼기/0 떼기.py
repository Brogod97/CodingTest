def solution(n_str):
    idx = 0
    
    for str in n_str:
        if str == '0':
            idx += 1
        else:
            break
    
    return n_str[idx::]

# 다른 풀이
return n_str.lstrip('0')
# lstrip() : 왼쪽 공백 또는 인자와 일치하는 문자열 제거
# rstrip() : 오른쪽 ~
# strip() : 양쪽 ~

# 다른 풀이
return str(int(n_str))
# int로 변환 과정에서 0으로 시작되는 부분은 제거

# 다른 풀이
for i in range(len(n_str)):
    if n_str[i] != '0':
        return n_str[i:]
