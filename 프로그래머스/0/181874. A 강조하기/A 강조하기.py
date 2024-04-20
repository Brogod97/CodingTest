def solution(myString):
    
    return myString.lower().replace('a','A')

# 다른 풀이
answer = ''
for i in myString:
    if i == 'a' or i == 'A':
        answer += 'A'
    elif i.isupper():
        answer += i.lower()
    else:
        answer += i
return answer
