def solution(n, k):
    
    return [num for num in range(1, n + 1) if num % k == 0]

# 다른 풀이
return [i for i in range(k, n+1, k)] # k 부터 n+1까지 k의 배수로
