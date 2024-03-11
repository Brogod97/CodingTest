str = input()
answer = ''

for i in str:
    if(i.isupper()):
        answer += i.lower()
    else:
        answer += i.upper()
    
print(answer)

# 다른 풀이
print(input().swapcase())
# swapcase() : 대소문자 상호 전환
# upper() : 대문자로 변환
# lower() : 소문자로 변환
# title() : 각 단어의 앞글자만 대문자로 변환
