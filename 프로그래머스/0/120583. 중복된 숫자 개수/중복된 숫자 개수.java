import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i : array) {
            if(i == n) {
                answer++;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
 return (int) Arrays.stream(array).filter(e -> e == n).count();
// .filter() : 스트림에서 주어진 조건을 만족하는 요소만을 선택하여 새로운 스트림을 생성
// .count() : 갯수 반환 (반환형 long)
