class Solution {
    public int solution(int a, int b) {
        
        int str1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int str2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        return str1 > str2 ? str1 : str2;
    }
}