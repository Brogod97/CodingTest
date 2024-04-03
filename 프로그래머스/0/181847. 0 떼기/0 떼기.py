def solution(n_str):
    idx = 0
    
    for str in n_str:
        if str == '0':
            idx += 1
        else:
            break
    
    return n_str[idx::]