class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            int a = 0;
            for (int j = 1; j<=n; j++) {
                if (i%j == 0) {
                    a++;
                }
            }
            if (a >= 3) {
                answer++;
            }
        }
        return answer;
    }
}

// 다른 풀이
return (int) IntStream.rangeClosed(1, n)
                      .filter(i -> (int) IntStream.rangeClosed(1, i)
                      .filter(i2 -> i % i2 == 0).count() > 2).count();
