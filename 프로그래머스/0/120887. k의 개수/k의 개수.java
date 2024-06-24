class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++) {
            for(String numStr : (x+"").split("")){
                if(Integer.valueOf(numStr) == k) {
                    answer++;
                }    
            }
            
        }
        
        return answer;
    }
}