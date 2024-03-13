def solution(s1, s2):
    answer = 0
    
    for i in s1:
        if i in s2:
            answer += 1
    
    return answer

# 다른 풀이
return len(set(s1)&set(s2));
# 1. set(S1), set(s2) : Set 자료구조로 변환
# - set : 중복된 값을 허용하지 않는 자료구조
# 2. & : 교집합 획득 (set.intersection과 동일)
# 3. len() : 길이 반환

# 다른 풀이
return len([x for x in s2 if x in s1])

# 다른 풀이
return sum(map(lambda v: s2.count(v), s1))
# count()
# - 문자열(string)과 리스트(list)에서 사용할 수 있는 내장 메서드 중 하나
# - 특정 값이 문자열 또는 리스트 내에서 등장하는 횟수를 세어 그 개수를 반환
