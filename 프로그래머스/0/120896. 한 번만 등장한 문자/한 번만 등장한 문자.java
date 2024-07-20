import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        Arrays.sort(arr);
        for(String s1 : arr){
            int cnt = 0;
            
            for(String s2 : arr){
                if(s1.equals(s2)) cnt++;
            }
            
            if(cnt == 1) answer += s1;         
        }
        
        return answer;
    }
}