def solution(my_strings, parts):
    answer = ''
    cnt = 0
    
    for string in my_strings:
        answer += string[parts[cnt][0] : parts[cnt][1] + 1]
        cnt += 1
    
    return answer

# 다른 풀이
answer = ""
for i, (s, e) in enumerate(parts):
    answer += my_strings[i][s:e+1]
return answer

# 다른 풀이
return ''.join([x[y[0]:y[1]+1] for x,y in zip(my_strings, parts)])

# 다른 풀이
answer = ''
for s, (x, y) in zip(my_strings, parts):
    answer += s[x:y+1]
return answer
