def solution(n):
    answer = 0
    
    if(n % 2 == 0):
        return sum([even ** 2 for even in range(0, n + 1) if even % 2 == 0])
    else:
        return sum([odd for odd in range(0, n + 1) if odd % 2 == 1])
    
    return answer