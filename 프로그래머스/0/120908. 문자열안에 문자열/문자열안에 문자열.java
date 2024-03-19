class Solution {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}

// 다른 풀이
int answer = 0;
if(str1.indexOf(str2) != -1){
    answer = 1;
}
else answer =2;
return answer;
