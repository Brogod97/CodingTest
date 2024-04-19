def solution(myString, pat):
    
    newStr = myString.replace('A', 'a').replace('B', 'A').replace('a', 'B')
    
    return 1 if pat in newStr else 0