def solution(binomial):

    return eval(binomial)

# 다른 풀이
a, op, b = binomial.split()
if op == '+': return int(a) + int(b)
if op == '-': return int(a) - int(b)
if op == '*': return int(a) * int(b)
