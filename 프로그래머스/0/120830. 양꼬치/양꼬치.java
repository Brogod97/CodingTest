class Solution {
    public int solution(int n, int k) {
        return n >= 10 ? 12000*n + 2000*(k - n/10) : 12000*n + 2000*k;
    }
}

// 다른 풀이
return n * 12000 + k * 2000 - (n / 10 * 2000);
