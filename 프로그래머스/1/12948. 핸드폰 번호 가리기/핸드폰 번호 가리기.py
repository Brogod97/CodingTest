def solution(phone_number):
    answer = ''
    
    idx = len(phone_number) - 4
    answer = '*' * idx
    answer += phone_number[idx:]
    
    return answer

# 다른 풀이
return "*"*(len(s)-4) + s[-4:] # -4로 뒤에서 가져오기

