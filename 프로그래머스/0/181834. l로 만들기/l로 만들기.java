class Solution {
    public String solution(String myString) {
        String answer = "";

        // a = 97 ... l = 108
        for(int i = 0; i < myString.length(); i++) {
            answer += myString.charAt(i) < 108 ? "l" : myString.charAt(i);
        }
        
        return answer;
    }
}