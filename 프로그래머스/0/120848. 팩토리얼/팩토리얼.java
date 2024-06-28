class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 10; i++) {
            if (factorial(i) <= n) {
                answer = i;
            } else {
                break;
            }
        }
        return answer;
    }

    public static int factorial(int number) {
        if (number > 1) {
            return number * factorial(number - 1);
        }
        return number;
    }
}

// 다른 풀이
int fac = 1;
int i = 0;

while(true){
    if(fac <= n){
        fac *= i + 1;
        i++;
    }else break;
}

return i-1;

// 다른 풀이
int answer = 1;
int factorial = 1;

while(n >= factorial) {
    answer ++;
    factorial *= answer;
}
return answer -1 ;
