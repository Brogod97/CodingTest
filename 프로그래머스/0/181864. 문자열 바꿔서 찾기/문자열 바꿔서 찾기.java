class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        
        for(String str : myString.split("")) {
            answer += "A".equals(str) ? "B" : "A";
        }
        
        return answer.contains(pat) ? 1 : 0;
    }
}