class Solution {
    public int solution(int order) {
        int answer = 0;
        String THREE_SIX_NINE = "3,6,9";
        
        for(String str: (String.valueOf(order)).split("")){
            if(THREE_SIX_NINE.contains(str)){
                answer++;
            }
        }
        
        return answer;
    }
}