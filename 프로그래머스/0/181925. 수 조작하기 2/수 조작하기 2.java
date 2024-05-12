class Solution {
    public String solution(int[] numLog) {
        String answer = "";        
        int prev = numLog[0];
        
        for(int num : numLog) {
            if((prev - num) == -1) answer += "w";
            if((prev - num) == 1) answer += "s";
            if((prev - num) == -10) answer += "d";
            if((prev - num) == 10) answer += "a";
            prev = num;
        }
        
        return answer;
    }
}