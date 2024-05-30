class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for(String str : s.split("")) {
            if(!(s.length() == 4 || s.length() == 6)){
                answer = false;
            }
            
            if(!Character.isDigit(str.charAt(0))) {
                answer = false;
            }
        }
        
        return  answer;
    }
}