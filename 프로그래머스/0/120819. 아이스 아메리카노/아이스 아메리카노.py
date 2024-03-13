def solution(money):
    answer = []
    
    answer.append(money//5500)
    answer.append(money%5500)
    
    return answer

# 다른 풀이
return [money // 5500, money % 5500]

# 다른 풀이
return divmod(money, 5500)
# divmod() : 몫과 나머지를 동시에 구할 때 사용
