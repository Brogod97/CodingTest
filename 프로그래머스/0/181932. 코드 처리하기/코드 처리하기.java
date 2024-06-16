class Solution {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        
        for(int i = 0; i < code.length(); i++){
            String str = code.charAt(i) + "";
            
            if(str.equals("1")) {
                mode = !mode;
                continue;
            }
            
            if(mode) {
                if(i % 2 == 1) {
                    ret += str;
                }
            } else {
                if(i % 2 == 0) {
                    ret += str;
                }
            }   
        }
        
        return ret.equals("") ? "EMPTY" : ret;
    }
}