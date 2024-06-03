class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i : array){
            for(String str : (i + "").split("")) {
                answer += str.equals("7") ? 1 : 0;
            }
        }
        
        return answer;
    }
}