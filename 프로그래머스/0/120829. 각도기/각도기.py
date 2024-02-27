def solution(angle):

    if angle < 90:
        return 1
    elif angle == 90:
        return 2
    elif 90 < angle and angle < 180:
        return 3
    else:
        return 4;

# if문 (if, elif, else)
# 주의 사항
# 1. 들여쓰기 주의: 파이썬은 들여쓰기로 코드 블록을 인식함
# 2. if문의 조건 사용 후 콜론(:)을 필수적으로 붙여야 함

# 한 줄 if문  (삼항 조건 연산자)
# 변수 = 값1 if 조건 else 값2