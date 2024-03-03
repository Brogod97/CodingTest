def solution(my_string):
    return ''.join(reversed(my_string))

# 다른 풀이
# 1. 문자열 슬라이싱
return my_string[::-1]

#2. for문
for i in range(len(my_string)-1, -1, -1) : 
    answer += my_string[i]
# 시작값: len(my_string)-1(마지막 인덱스부터), 종료: -1(0까지 역순으로 반복), 간격: -1
