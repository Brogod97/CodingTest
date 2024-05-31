class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 1) {
            answer += s.charAt(s.length() / 2);
        }else {
            int center = s.length() / 2;
            answer += s.substring(center - 1, center + 1) ;
        }
        
        return answer;
    }
}

// 다른 풀이
return s.substring((s.length()-1)/2, s.length()/2 + 1);
