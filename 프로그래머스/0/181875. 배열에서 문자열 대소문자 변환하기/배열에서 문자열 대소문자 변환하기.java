class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int idx = 0;
        
        for(String str: strArr) {
            answer[idx] = idx % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
            idx++;
        }
        
        return answer;
    }
}