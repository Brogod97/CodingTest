def solution(my_string, letter):
    return my_string.replace(letter, '')

# .replace(타겟, 변경할 문자 [, 변경할 횟수]) : 문자열을 변경하는 함수
# 횟수 생략 시 문자열 전체를 변경

# 다른 답안 1
answer = ''
for string in my_string:
    if string != letter:
        answer += string
return answer

# 다른 답안 2
return ''.join([c for c in my_string if c != letter])
