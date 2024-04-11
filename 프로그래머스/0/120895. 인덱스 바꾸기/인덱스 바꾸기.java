class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            
            if(i == num1) {
                answer += strArr[num2];    
                continue;
            } else if(i == num2) {
                answer += strArr[num1];    
                continue;
            }
            
            answer += strArr[i];
        }
        
        return answer;
    }
}