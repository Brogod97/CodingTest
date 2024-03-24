def solution(my_string):
    
    return sum([int(x) for x in list(my_string) if x.isdigit()])

# 다른 풀이
answer = 0
for x in list(my_string):
    if(x.isdigit()):
        answer += int(x)

return answer

# 다른 풀이
answer = 0
for i in my_string:
    try:
        answer = answer + int(i)
    except:
        pass

return answer

# 다른 풀이
return sum(map(int, filter(lambda x: x.isdigit(), my_string)))
