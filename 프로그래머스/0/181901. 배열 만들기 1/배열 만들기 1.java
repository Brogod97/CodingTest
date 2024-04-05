import java.util.stream.*;

class Solution {
    public int[] solution(int n, int k) {
        
        return IntStream.rangeClosed(1, n)
                 .filter(num -> num % k == 0)
                 .toArray();
    }
}

// 다른 풀이
int count = n / k;
int[] answer = new int[count];

for (int i = 1; i <= count; i++) {
    answer[i - 1] = k * i;
}

return answer;
