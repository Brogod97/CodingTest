def solution(myString, pat):
    
    newStr = myString.replace('A', 'a').replace('B', 'A').replace('a', 'B')
    
    return 1 if pat in newStr else 0

# 다른 풀이
return int(''.join(['A' if i == 'B' else 'B' for i in pat]) in myString)
# pat의 길이가 더 짧기 때문에 pat의 값을 반전시키는 방법
