def solution(myString, pat):
    
    return myString[0:myString.rfind(pat)] + pat

# 다른 풀이
return myString[:len(myString) - myString[::-1].index(pat[::-1])]

