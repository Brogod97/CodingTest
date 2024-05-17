class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        for(String str : s.split("")) {
            if(str.toLowerCase().equals("p")) {
                p++;
            } else if(str.toLowerCase().equals("y")) {
              y++;  
            }
        }

        return p == y ? true : false;
    }
}