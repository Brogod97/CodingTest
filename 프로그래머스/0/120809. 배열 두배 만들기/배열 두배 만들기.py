def solution(numbers):
    return list(map(lambda i : i * 2, numbers))

# 참고
# map > list comprehension > map + lambda > for loop 으로 성능이 좋음

# 다른 풀이
# 리스트 컴프리헨션
return [num*2 for num in numbers]

# 다른 풀이
answer = []
for num in numbers:
    answer.append(num * 2)
return answer

