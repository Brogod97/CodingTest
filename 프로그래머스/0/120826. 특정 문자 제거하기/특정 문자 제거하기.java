import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        
        for(String str : my_string.split("")) {
            if(!str.equals(letter)) {
                sb.append(str);
            }
        }
        
        return sb.toString();
    }
}