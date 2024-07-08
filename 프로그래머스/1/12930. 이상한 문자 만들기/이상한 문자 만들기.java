class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        int cnt = 0;

        for(String word : strArr) {
            cnt = word.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? word.toLowerCase() : word.toUpperCase(); 
        }

        return answer;
    }
}