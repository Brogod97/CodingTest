def solution(phone_number):
    answer = ''
    
    idx = len(phone_number) - 4
    answer = '*' * idx
    answer += phone_number[idx:]
    
    return answer