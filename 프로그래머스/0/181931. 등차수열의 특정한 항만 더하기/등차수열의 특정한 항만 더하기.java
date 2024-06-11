class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer += a + d * i;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
return IntStream.range(0, included.length)
                .map(idx -> included[idx] ? a+(idx*d) : 0)
                .sum();
