def solution(rsp):
    answer = ''
    
    for x in rsp:
        if(x == "0"):
            answer += "5";
        elif(x == "2"):
            answer += "0";
        else:
            answer += "2";
    
    return answer

# 다른 풀이
d = {'0':'5','2':'0','5':'2'}
return ''.join(d[i] for i in rsp)

return rsp.translate(str.maketrans('025', '502'))
# str.translate() : 문자열의 여러 문자를 한 번에 치환
# str.maketrans() : 문자열을 다른 문자열로 매핑하는 테이블 생성
# 즉, maketrans를 이용해 '0'은 '5'로, '2'는 '0'으로, '5'는 '2'로 변환 후 translate를 통해 rsp 문자열에 대해 앞서 변환한 테이블을 적용
