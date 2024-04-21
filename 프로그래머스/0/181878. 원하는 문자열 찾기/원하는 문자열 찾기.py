def solution(myString, pat):
    a = "a"
    
    return 1 if pat.lower() in myString.lower() else 0

# 다른 풀이
return int(pat.lower() in myString.lower())

# 다른 풀이
answer = myString.lower().find(pat.lower())
