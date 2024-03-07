def solution(n, k):
    return 12000 * n + 2000 * k if n < 10 else 12000 * n + 2000 * (k - n//10)