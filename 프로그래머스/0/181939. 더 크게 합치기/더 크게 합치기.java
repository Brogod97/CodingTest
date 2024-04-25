class Solution {
    public int solution(int a, int b) {
        
        int str1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int str2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        return str1 > str2 ? str1 : str2;
    }
}

// 다른 풀이
int answer = 0;
int aLong = Integer.parseInt(""+a+b);
int bLong = Integer.parseInt(""+b+a);
answer = aLong > bLong ? aLong : bLong;

return answer;

// 다른 풀이
return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
