import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }
}

// 다른 풀이
int answer = 0;
for(int i : array) {
    if(i > height) {
        answer++;    
    }
}
return answer;

// 다른 풀이
