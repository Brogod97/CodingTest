def solution(str1, str2):
    return 1 if str2 in str1 else 2

# str.find("abc") : 찾고자하는 문자열이 존재할 경우, 시작 인덱스 값을 리턴 (없을 경우 -1 리턴)
# in, not in : 결과값이 있으면 True, 없으면 False 반환

# 다른 풀이
return 1 + int(str2 not in str1)

# 다른 풀이
if str1.count(str2):
    return 1
else:
    return 2

# 다른 풀이
answer = str1.split(str2)
if len(answer) == 1:
    return 2
else :
    return 1
