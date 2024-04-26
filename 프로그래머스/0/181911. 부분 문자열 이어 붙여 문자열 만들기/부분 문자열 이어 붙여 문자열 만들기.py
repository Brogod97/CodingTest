def solution(my_strings, parts):
    answer = ''
    cnt = 0
    for string in my_strings:
        answer += string[parts[cnt][0] : parts[cnt][1] + 1]
        cnt += 1
    
    return answer