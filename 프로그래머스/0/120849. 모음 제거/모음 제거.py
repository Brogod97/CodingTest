import re

def solution(my_string):
    
    reg = re.compile("[^aeiou]")
    
    return ''.join(reg.findall(my_string))