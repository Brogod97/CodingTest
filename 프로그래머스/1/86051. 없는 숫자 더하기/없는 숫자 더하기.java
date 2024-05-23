class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        
        for(int i = 0 ; i <= 9; i++){
            max += i;
            for(int num : numbers) {
                if(num == i) {
                    answer += i;
                    break;
                } 
            }
        }
        
        return max - answer;
    }
}