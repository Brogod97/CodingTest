class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0, s)
                + overwrite_string 
                + my_string.substring(overwrite_string.length() + s);
        
        return answer;
    }
}

// 다른 풀이
String before = my_string.substring(0, s);
String after = my_string.substring(s + overwrite_string.length());
return before + overwrite_string + after;

// 다른 풀이
char[] my_chars = my_string.toCharArray();
char[] overwrite_chars = overwrite_string.toCharArray();
for (int i=0; i<overwrite_chars.length; i++) {
    my_chars[s + i] = overwrite_chars[i];
}
return String.valueOf(my_chars);
