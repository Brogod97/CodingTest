import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int[] order = emergency.clone();
        Arrays.sort(order);
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(order[i] == emergency[j]) {
                    answer[j] = len - i;
                }
            }
        }
            
        return answer;
    }
}