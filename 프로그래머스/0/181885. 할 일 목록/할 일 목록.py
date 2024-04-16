def solution(todo_list, finished):
    answer = []
    
    for i in range(0, len(finished)):
        if not(finished[i]):
            answer.append(todo_list[i])
    
    return answer

# 다른 풀이
return [work for idx, work in enumerate(todo_list) if not finished[idx]]

# 다른 풀이
return [x for x, b in zip(todo_list, finished) if not b] 
# zip(*iterables) : 두 개 이상의 시퀀스(리스트, 튜플 등)를 인자로 받음
#                   각 시퀀스에서 같은 인덱스에 있는 요소들을 묶어서 튜플의 형태로 반환
