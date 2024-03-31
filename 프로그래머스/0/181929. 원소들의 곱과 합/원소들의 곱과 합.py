def solution(num_list):
    sum = 0
    mul = 1
    
    for num in num_list:
        sum += num
        mul *= num
    
    return 1 if mul < pow(sum, 2) else 0