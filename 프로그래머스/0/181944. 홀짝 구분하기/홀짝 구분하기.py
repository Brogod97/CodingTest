a = int(input())

print(str(a) + " is " + ("even" if a % 2 == 0 else "odd"))

# 다른 풀이
print(f"{n} is {'eovdedn'[n&1::2]}")

# 다른 풀이
print(f"{n} is {'even' if n % 2 == 0 else 'odd'}")
