class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int count = 0;
        for(int num : num_list) {
            if(num % 2 == 0) {
                count++;
            }
        }
        
        answer[0] = count;
        answer[1] = num_list.length - count;
        
        return answer;
    }
}