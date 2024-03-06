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

// 다른 풀이
return my_string.replace(letter, "");
// .replace(타겟, 대체할 문자) : 처음 발견한 문자를 치환 후 반환
// .replaceAll(타겟, 대체할 문자) : 발견한 모든 문자를 치환 후 반환
