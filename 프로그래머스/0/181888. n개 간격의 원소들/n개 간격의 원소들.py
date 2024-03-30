def solution(num_list, n):
    
    return num_list[::n]

# 슬라이싱: 리스트[start:stop:step]
#    - start: 시작 위치(포함 O), 생략 시 처음부터
#    - stop: 종료 위치(포함 X), 생략 시 끝까지
#    - step: 건너뛸 간격, 생략시 1

# 다른 풀이
return num_list[0 : len(num_list) : n]

# 다른 풀이
return [num_list[i] for i in range(0, len(num_list), n)]
# range(start, stop, step): 슬라이싱의 인자 설명과 동일 
