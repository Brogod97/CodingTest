def solution(slice, n):
    return n // slice + 1 if n % slice != 0 else n // slice

# 다른 풀이
return ((n - 1) // slice) + 1

# 다른 풀이
d, m = divmod(n, slice)
return d + int(m != 0)

# 다른 풀이
return ceil(n/slice)
