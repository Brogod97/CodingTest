import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        while(n != 1){
            answer.add(n);
            
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            
            if(n == 1){
                answer.add(1);       
            }
        }
        
        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}

// 다른 풀이
return IntStream.concat(IntStream.iterate(n, i -> i > 1, i -> i % 2 == 0 ? i / 2 : i * 3 + 1), IntStream.of(1))
                .toArray();
