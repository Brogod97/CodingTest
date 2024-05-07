import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int[] interval : intervals) {
            for( int i = interval[0]; i <= interval[1]; i++ ) {
                answer.add(arr[i]);        
            }
        }
        
        return answer.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}

// 다른 풀이
return Arrays.stream(intervals)
             .flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1] + 1))).toArray();
