def solution(strlist):
    answer = []
    
    for str in strlist:
        answer.append(len(str))
    
    return answer

# for 변수 in 콜렉션: 파이썬 반복문
# 배열.append(): 배열에 값 추가
# len(): 길이 반환

# 다른 풀이 1
return list(map(len, strlist))
# map(함수, Iterable 객체) : 각 요소에 대해 함수를 적용하고 그 결과를 새로운 이터레이터로 반환
# list(): 이터레이터 -> 리스트로 변환

# 다른 풀이 2
return [len(str) for str in strlist]
# 리스트 컴프리헨션 : 간단한 반복 작업을 통해 새로운 리스트를 생성하는 파이썬의 기능
# [표현식 for 요소 in Iterable 객체]
