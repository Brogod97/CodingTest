class Solution {
    public int solution(int n, int t) {
        return (int)Math.pow(2, t) * n;
    }
}

// 다른 풀이
return n << t;


