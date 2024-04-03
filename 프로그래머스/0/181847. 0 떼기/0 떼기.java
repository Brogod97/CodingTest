class Solution {
    public String solution(String n_str) {
        
        for(String str: n_str.split("")){
            if(str.equals("0"))
                n_str = n_str.replaceFirst("0", "");
            else
                return n_str;
        }
        
        return n_str;
    }
}