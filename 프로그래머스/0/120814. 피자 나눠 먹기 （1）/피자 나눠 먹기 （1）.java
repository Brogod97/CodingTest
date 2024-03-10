class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 > 0) {
            answer = n / 7 + 1;
        } else {
            answer = n / 7;
        }
        
        return answer;
    }
}

// 다른 풀이
return (n + 6) / 7;
