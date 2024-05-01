def solution(myString):
    answer = ''
    
    for str in myString:
        if(str < 'l'):
            answer += 'l'
        else:
            answer += str
    
    return answer

# 다른 풀이
return myString.translate(str.maketrans('abcdefghijk', 'lllllllllll'))
# str.replace(old, new) : 모든 old 문자열을 new 문자열로 치환

# 다른 풀이
answer = [x if x > 'l' else 'l' for x in myString]
return ''.join(answer)
