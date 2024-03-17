def solution(sides):
    sides.sort()
    
    return 1 if sides[0] + sides[1] > sides[2] else 2    

# 참고
# sort() 와 sorted()의 차이
# sort() : 기존 리스트 정렬
# sorted() : 정렬된 새로운 리스트 반환

# 다른 풀이
return 1 if max(sides) < (sum(sides) - max(sides)) else 2

# 다른 풀이
c = max(sides)
sides.remove(c)
a = sum(sides)

return 1 if c < a else 2
