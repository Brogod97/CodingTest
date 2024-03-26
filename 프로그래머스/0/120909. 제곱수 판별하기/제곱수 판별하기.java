class Solution {
    public int solution(int n) {
        
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}

// 다른 풀이
if (n % Math.sqrt(n) == 0) {
    return 1;
} else {
    return 2;
}

// 다른 풀이
