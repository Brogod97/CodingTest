def solution(array, height):
    return sum(1 for x in array if x > height)

# 다른 풀이
array.append(height)
array.sort(reverse=True)
return array.index(height)
# .sort(reverse=True) : 리스트 순서 뒤집기

# 다른 풀이
answer = 0
for i in array:
    if i > height:
        answer += 1
return answer

# 다른 풀이
return len(list(filter(lambda v: v > height, array)))
# array에 대해 lambda 수행 후 조건이 일치하는 경우 list로 반환
# 리스트의 길이 반환

