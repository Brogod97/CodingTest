class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        
        if(x > 0) {
            answer = y > 0 ? 1 : 4;
        }else {
            answer = y > 0 ? 2 : 3; 
        }
        
        return answer;
    }
}

// 다른 풀이
int xParam = dot[0] < 0 ? 1 : 0;
int yParam = dot[1] < 0 ? 2 : 0;

return 1 + ((xParam | yParam) ^ (yParam >> 1));
// 비트 연산을 이용한 풀이
// (xParam | yParam) : 두 변수 중 하나라도 해당 비트가 설정되어 있으면 결과 설정 
// -- xParam이 1이고, yParam이 2라면 3 반환
// (yParam >> 1) : yParam을 오른쪽으로 1비트 시프트한 값
// -- yParam이 2일 경우 1 반환
// ^ : XOR 연산, 좌 우측 연산의 값이 다른 경우에만 1 반환, 같으면 0 반환
// 1 + : 마지막으로 결과에 1을 더함
