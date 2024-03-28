class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for(char i : rsp.toCharArray()) {
            switch(i) {
                case '0' -> answer += "5";
                case '2' -> answer += "0";
                case '5' -> answer += "2";
            }
        }
        
        return answer;
    }
}