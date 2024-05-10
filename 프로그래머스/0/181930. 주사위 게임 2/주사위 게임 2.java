class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a != b && a != c && b != c) {
            answer = a + b + c;
        } else if(a == b && b == c) {
            answer = (a + b + c) * powNum(a, b, c, 2) * powNum(a, b, c, 3);
        } else {
            answer = (a + b + c) * powNum(a, b, c, 2);
        }
        
        return answer;
    }
    
    public int powNum(int a, int b, int c, int power) {
        return (int)(Math.pow(a , power) + Math.pow(b , power) + Math.pow(c , power));
    }
}