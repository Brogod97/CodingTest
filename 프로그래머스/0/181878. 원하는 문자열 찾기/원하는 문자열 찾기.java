class Solution {
    public int solution(String myString, String pat) {
        
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}

// 다른 풀이
int answer = 0;
String str = myString.toLowerCase();
String str2 = pat.toLowerCase();

if (str.indexOf(str2) != -1) {
    return 1;
}
return 0;
