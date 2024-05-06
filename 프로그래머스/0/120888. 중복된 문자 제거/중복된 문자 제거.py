def solution(my_string):
    
    return ''.join(dict.fromkeys(my_string)) 
# dict.fromkeys()
#     - 주어진 iterable(반복 가능한 객체)의 각 요소를 키로 하고, 모든 키에 대해 동일한 값으로 초기화된 딕셔너리를 생성
#     - 모든 키에 대해 값으로 None을 가지는 딕셔너리를 생성
# dict.fromkeys(my_string, initial_value) : 모든 키에 대해 초기값을 가지는 딕셔너리 생성

# 파이썬 3.6부터 dict가 순서 보장
# 명시적으론 collections.OrderedDict 사용

# 다른 풀이
answer = ''
for i in my_string:
    if i not in answer:
        answer+=i
return answer
