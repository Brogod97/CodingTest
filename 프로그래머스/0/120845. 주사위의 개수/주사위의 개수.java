class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int side : box) {
            answer *= side / n;
        }
        
        return answer;
    }
}

// 다른 풀이
int answer = 1;

answer *= box[0]/n;
answer *= box[1]/n;
answer *= box[2]/n;

return answer;
