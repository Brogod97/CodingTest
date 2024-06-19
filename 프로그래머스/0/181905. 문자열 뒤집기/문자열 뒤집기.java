class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuilder sb = new StringBuilder();
        String reversed = sb.append(my_string.substring(s, e + 1)).reverse().toString();
        
        return my_string.substring(0, s) + reversed + my_string.substring(e + 1, my_string.length());
    }
}

// 다른 풀이
StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
answer.reverse();
return my_string.substring(0, s) + answer + my_string.substring(e + 1);

// 다른 풀이
char[] arr = my_string.toCharArray();
while (s < e) {
    char temp = arr[s];
    arr[s++] = arr[e];
    arr[e--] = temp;
}

return new String(arr);
