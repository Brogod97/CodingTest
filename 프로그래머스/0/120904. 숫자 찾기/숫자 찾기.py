def solution(num, k):
    
    return ('-' + str(num)).find(str(k))

# 다른 풀이
return -1 if str(k) not in str(num) else str(num).find(str(k)) + 1

# 다른 풀이
for i, n in enumerate(str(num)):
    if str(k) == n:
        return i + 1
return -1
# enumerate(iterable, start=0): 순회 가능한(iterable) 객체(예: 리스트, 튜플, 문자열 등)를 입력으로 받아 각 요소의 인덱스와 값을 포함하는 enumerate 객체를 반환
#     - index는 기본적으로 0부터 시작
#     - 2번쨰 매개변수로 start 값을 받아 index의 시작 값을 설정 가능
#     - 인덱스, 값 쌍의 튜플로 반환

# 다른 풀이
try:
    return str(num).index(str(k)) + 1
except ValueError:
    return -1
# ValueError : 함수나 연산의 인자가 올바른 자료형이지만, 그 값이 허용 범위를 벗어날 때 발생
# str(k)가 str(num).index()로 호출될 때, 존재하지 않을 경우 ValueError 발생
