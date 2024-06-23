class Solution {
    public int solution(int[] array, int n) {
        int result = array[0];
        
        for(int i : array) {
            int fix = Math.abs(result - n);
            int curr = Math.abs(i - n);
            
            if (fix > curr || (fix == curr && result > i)) {
                result = i;
            }
        }

        return result;
    }
}