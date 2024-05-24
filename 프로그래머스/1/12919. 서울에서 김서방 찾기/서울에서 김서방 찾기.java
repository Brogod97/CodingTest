import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}

// 다른 풀이
for(int i=0; i<seoul.length; i++){
    if(seoul[i].equals("Kim")) {
        x = i ;
        break;
    }
 }
return "김서방은 "+ x + "에 있다";
