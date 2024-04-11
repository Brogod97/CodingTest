def solution(my_string, num1, num2):
    answer = ''
    idx = 0
    
    for str in my_string:
        if idx == num1:
            answer += my_string[num2]
            idx += 1
        elif idx == num2:
            answer += my_string[num1]
            idx += 1
        else:
            answer += str
            idx += 1
    
    return answer

# 다른 풀이
s = list(my_string)
s[num1],s[num2] = s[num2],s[num1] # swap
return ''.join(s)
