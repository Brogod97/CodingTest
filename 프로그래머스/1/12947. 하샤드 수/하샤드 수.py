def solution(x):
    
    sum = 0;
    for num in str(x):
        sum += int(num)
    
    return x % sum == 0