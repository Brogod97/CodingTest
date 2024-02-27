class Solution {
    public int solution(int angle) {
        
        if(angle < 90) {
            return 1;
        }else if(angle == 90) {
            return 2;
        }else if(90 < angle && angle < 180) {
            return 3;
        }else {
            return 4;
        }
    }
}

// (참고) 삼항연산자를 적용하는 경우
// return angle < 90 ? 1 : angle == 90 ? 2 : angle == 180 ? 4 : 3;
