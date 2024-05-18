class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = i == j ? 1 : 0;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
int[][] answer = new int[n][n];
for(int i = 0 ; i < n ; i++) {
    answer[i][i] = 1;
}
return answer;

return IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, n).map(j -> j == i ? 1 : 0).toArray())
                .toArray(int[][]::new);





