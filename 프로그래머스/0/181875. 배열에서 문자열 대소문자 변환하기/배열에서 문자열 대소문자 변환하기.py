def solution(strArr):
    answer = []
    idx = 0
    
    for str in strArr:
        if idx % 2 == 0:
            answer.append(str.lower())
        else:
            answer.append(str.upper())
        idx += 1
    
    return answer

# 다른 풀이
return [s.lower() if i % 2 == 0 else s.upper() for i, s in enumerate(strArr)]
# enumerate(): 인덱스와 값의 쌍으로 이루어진 이터러블을 생성
#     - 0: "AbC"
#     - 1: "aBc"
