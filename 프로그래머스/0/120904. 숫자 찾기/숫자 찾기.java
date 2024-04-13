class Solution {
    public int solution(int num, int k) {
        int idx = 0;
        
        for(String str : ("" + num).split("")){
            idx++; 
            if(Integer.parseInt(str) == k) {
                return idx;
            }            
        }
        
        return -1;
    }
}