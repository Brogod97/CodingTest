def solution(num_list):
    answer = []
    even, odd = 0, 0
    
    for num in num_list:
            if(num % 2 == 0):
                even += 1
            else:
                odd += 1
                
    answer.append(even)
    answer.append(odd)
    
    return answer

# 다른 풀이
answer = [0,0]
for n in num_list:
    answer[n%2]+=1
return answer
