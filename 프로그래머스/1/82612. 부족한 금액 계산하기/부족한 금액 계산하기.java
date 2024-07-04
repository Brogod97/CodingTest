class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        
        for(int i = 1; i <= count; i++){
            total += price * i;
        }
        
        if(money < total) {
            answer = total-money;
        } else {
            answer = 0;
        }

        return answer;
    }
}

// 다른 풀이
return Math.max(price * (count * (count + 1) / 2) - money, 0);

// 다른 풀이
long answer = money;

for (int cnt = 0; cnt < count; ++cnt) {
    answer -= (price * (cnt + 1));
}

return (answer > 0 ? 0 : -answer);
