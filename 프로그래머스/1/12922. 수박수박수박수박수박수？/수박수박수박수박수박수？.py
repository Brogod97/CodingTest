def solution(n):
    answer = ''
    
    for i in range(0, n):
        if i % 2 == 0:
            answer += "수"
        else:
            answer += "박"
    
    return answer

# 다른 풀이
str = "수박"*n
return str[:n]

# 다른 풀이
return "수박" * (n//2) + "수" * (n%2)

# 다른 풀이
return "".join(["수박"[i%2] for i in range(n)])
