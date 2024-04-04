class Solution {
    public int solution(int a, int b) {
        int sum = Integer.parseInt("" + a + b);
        int mul = 2 * a * b;
        
        if(sum > mul || sum == mul) {
            return sum;
        }else {
            return mul;
        }
    }
}