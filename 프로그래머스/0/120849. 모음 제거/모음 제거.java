import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        return my_string.replaceAll("[aeiou]", "");
    }
}

// 다른 풀이
String[] vowels = new String[]{"a", "e", "i", "o", "u"};
for(String vowel : vowels){
    if(my_string.contains(vowel)){
        my_string = my_string.replace(vowel, "");
    }
}
return my_string;
