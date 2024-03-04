def solution(array, n):
    return array.count(n)

# 다르 풀이 1
return sum(1 for x in array if x == n)
# 리스트 컴프리헨션: [표현식 for 항목 in iterable if 조건]
    # for x in array: array의 각 요소(x)에 대해 반복
    # if x == n : x가 n일 경우 
    # 1 : 표현식 수행 (1 생성)
# sum(): 생성된 1들의 합계 (즉, count 처럼 동작)

# 다른 풀이 2
answer = 0

for i in range(len(array)):
    if array[i] == n:
        answer += 1
        
return answer
