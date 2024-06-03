def solution(array):

    return str(array).count('7')

# 다른 풀이
answer = sum([str(i).count("7") for i in array])
return answer
