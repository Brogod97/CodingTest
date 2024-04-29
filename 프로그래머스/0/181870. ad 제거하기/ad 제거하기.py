def solution(strArr):
    
    return [str for str in strArr if str.find('ad') < 0]

# 다른 풀이
return [word for word in strArr if 'ad' not in word]
