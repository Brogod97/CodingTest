import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i : arr) {
            for(int j = 0; j < i; j++) {
                answer.add(i);
            }
        }
        
        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}

// 다른 풀이
return Arrays.stream(arr)
             .boxed()
             .flatMap(num -> Collections.nCopies(num, num).stream())
             .collect(Collectors.toList());
