class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i <= n; i++) {
            if(n % 2 == 0) {
                if(i % 2 == 0) {
                    answer += i * i;    
                }
            } else {
                if(i % 2 == 1) {
                    answer += i;
                }
            }
        }
        
        return answer;
    }
}

// 다른 풀이
int answer = 0;

for(int i = n; i >= 0; i -= 2)
    answer += (n % 2 == 0) ? i * i : i;

return answer;

// 다른 풀이
if (n % 2 == 1) {
    return (n + 1) * (n + 1) / 2 / 2;
} else {
    return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;   
}
