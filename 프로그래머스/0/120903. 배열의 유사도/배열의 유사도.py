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
