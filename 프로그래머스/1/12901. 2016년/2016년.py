import datetime

def solution(a, b):
    
    week = {0: "MON", 1: "TUE",2: "WED",3: "THU",4: "FRI",5: "SAT",6: "SUN"}
    day = datetime.date(2016, a, b).weekday()
    
    return week[day]

# 다른 풀이
month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
day = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
return day[(sum(month[:a-1])+b-1)%7]

# 다른 풀이
t = 'MON TUE WED THU FRI SAT SUN'.split()
return t[datetime.datetime(2016, a, b).weekday()]
