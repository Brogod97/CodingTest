def solution(arr, idx):
    answer = 0
    
    try :
        answer = arr.index(1, idx)
    except ValueError :
        answer = -1
        
    return answer

# 다른 풀이
for i in range(idx, len(arr)):
    if arr[i] == 1:
        return i
return -1
