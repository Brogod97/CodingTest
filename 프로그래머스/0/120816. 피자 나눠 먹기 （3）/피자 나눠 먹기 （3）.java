class Solution {
    public int solution(int slice, int n) {
        return n % slice != 0 ? n / slice + 1 : n / slice;
    }
}

// 다른 풀이
return (n + slice - 1) / slice;
