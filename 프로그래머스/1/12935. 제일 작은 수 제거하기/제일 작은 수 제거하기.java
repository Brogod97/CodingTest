import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> answer = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i : arr) {
            min = Math.min(i, min);
        }
        
        for (int i : arr) {
            if(i != min){
                answer.add(i);
            }
        }
        
        if(answer.size() == 0) {
            return new int[]{-1};
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}