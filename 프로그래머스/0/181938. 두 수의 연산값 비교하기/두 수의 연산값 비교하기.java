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

// 변수명 --> ab 

// 다른 풀이
return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)), 2*a*b);
