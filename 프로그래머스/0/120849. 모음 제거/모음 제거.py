import re

def solution(my_string):
    
    reg = re.compile("[^aeiou]")
    
    return ''.join(reg.findall(my_string))

# 다른 풀이
return "".join([i for i in my_string if not(i in "aeiou")])

# 다른 풀이
vowels = ['a','e','i','o','u']
for vowel in vowels:
    my_string = my_string.replace(vowel, '')
return my_string
