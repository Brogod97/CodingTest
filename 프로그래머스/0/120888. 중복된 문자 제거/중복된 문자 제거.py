def solution(my_string):
    
    return ''.join(dict.fromkeys(my_string)) # 파이썬 3.6부터 dict가 순서 보장
    