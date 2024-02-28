def solution(n):
    answer = 0
    
    for i in range(n + 1):
        if i % 2 == 0:
            answer += i
    
    return answer

# Python의 for문
# for 요소 in 컬렉션(또는 반복 가능한 객체):
#   반복 실행할 코드

# range() : 연속된 숫자들의 시퀀스를 생성하는 데 사용
# range([start], stop[, step]) : [시작], 종료, [간격]을 입력