def solution(n):
    
    if(n % 2 == 0):
        return sum([even ** 2 for even in range(0, n + 1) if even % 2 == 0])
    else:
        return sum([odd for odd in range(0, n + 1) if odd % 2 == 1])

# 다른 풀이
return sum(x ** (2 - x % 2) for x in range(n + 1) if n % 2 == x % 2)
# x ** (2 - x % 2): 짝수일 경우 x % 2 = 0으로 2, 홀수일 경우 반대로 1
# range(n + 1) : 시작 값 생략 시 0부터 진행

# 다른 풀이
if n%2:
    return sum(range(1,n+1,2)) # 1부터 2씩 == 홀수 
return sum([i*i for i in range(2,n+1,2)]) # 2부터 2씩 == 짝수
