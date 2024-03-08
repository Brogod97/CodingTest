def solution(n):
    return sum(map(int, str(n)))

# sum() : 합계 함수
# map(function, iterable, ...) : 순회 함수
# int(): 정수 변환
# str() : 문자로 변환
    # 예시 - str(123) = '123' 
    # 문자열 '123'은 iterable로, ['1', '2', '3']처럼 차례로 접근 가능

# 다른 풀이
return sum(int(i) for i in str(n))

# 다른 풀이
answer = 0
while n: 
    answer += n%10
    n //= 10
return answer
# while n: n이 0이 아닌 동안 수행

# 다른 풀이
answer = 0
while n:
    n, r = divmod(n, 10)
    answer += r
return answer

# n, r = divmod(n, 10) : n을 10으로 나눈 몫과 나머지를 반환
