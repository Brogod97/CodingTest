def solution(num_list):
    answer = 0
    
    for num in num_list:
        while num != 1:
            if num % 2 == 0:
                num = num / 2
                answer += 1
            else:
                num = (num - 1) / 2
                answer += 1
    
    return answer

# 다른 풀이
return sum(len(bin(i)) - 3 for i in num_list)

# 다른 풀이
 answer = 0

for n in num_list:
    while n != 1:
        n //= 2
        answer += 1

return answer

