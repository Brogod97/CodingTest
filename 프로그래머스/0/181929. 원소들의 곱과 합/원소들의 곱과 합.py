def solution(num_list):
    sum = 0
    mul = 1
    
    for num in num_list:
        sum += num
        mul *= num
    
    return 1 if mul < pow(sum, 2) else 0

# 다른 풀이
s=sum(num_list)**2
m=eval('*'.join([str(n) for n in num_list]))
return 1 if s>m else 0
# eval(표현식) : 문자열로 표현된 파이썬 표현식이나 문을 실행하고 그 결과를 반환

# 다른 풀이
mul = 1 
for n in num_list:
    mul *= n
return int(mul < sum(num_list) ** 2)

# 다른 풀이
return 1 if (reduce(lambda x, y: x * y, num_list)) < (sum(num_list) ** 2) else 0

# 다른 풀이
import math

answer = 0
if math.prod(num_list) < (sum(num_list)**2):
    answer = 1
return answer
# math.prod(iterable) : 주어진 이터러블(iterable)의 모든 요소를 곱한 값을 반환
