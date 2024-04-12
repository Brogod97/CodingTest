def solution(myString):

    return [len(str) for str in myString.split('x')]

# 다른 풀이
return list(map(lambda x: len(x), myString.split('x')))
# map(function, iterable, ...) : 주어진 함수를 시퀀스(리스트, 튜플 등)의 각 요소에 적용하여 새로운 시퀀스를 반환
#     - function : 시퀀스의 각 요소에 적용할 함수
#     - iterable : 입력 시퀀스
