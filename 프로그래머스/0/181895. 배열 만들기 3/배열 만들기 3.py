def solution(arr, intervals):

    return arr[intervals[0][0]:intervals[0][1] + 1] + arr[intervals[1][0]:intervals[1][1] + 1]

# 다른 풀이
s1, e1 = intervals[0]
s2, e2 = intervals[1]
return arr[s1:e1+1] + arr[s2:e2+1]

# 다른 풀이
answer = []
for a,b in intervals: answer+=arr[a:b+1]
return answer
