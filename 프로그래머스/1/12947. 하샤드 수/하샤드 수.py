def solution(x):
    
    sum = 0;
    for num in str(x):
        sum += int(num)
    
    return x % sum == 0

# 다른 풀이
return n%sum(int(x) for x in str(n)) == 0
