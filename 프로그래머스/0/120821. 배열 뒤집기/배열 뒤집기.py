def solution(num_list):
    answer = []
    
    return list(reversed(num_list))

# [리스트].reverse()
# - 리스트를 뒤집는다. 
# - 값을 반환하지 않는다. 
# - 리스트 함수로 리스트에만 쓸 수 있다.
# - 리스트의 원형을 변경한다.

# reversed(리스트)
# - 리스트를 뒤집는다. 
# - 값을 반환한다.
# - 튜플, 스트링, 딕셔너리에도 사용 가능하다.
# - 객체의 원형을 변경하지 않는다.

# 다른 풀이 1
return num_list[::-1]
# 슬라이싱 - [start:end:step] 
# [::-1]: 역순으로 뒤집기

# 다른 풀이 2
result =[]
while(num_list):
    result.append(num_list.pop())
return result
# append(): 새로운 요소를 리스트의 끝에 추가
# pop(): 리스트의 마지막 요소를 제거하고 반환
