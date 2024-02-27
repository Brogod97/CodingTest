
class Solution {
    public int solution(int num1, int num2) {
        double divide = (double) num1 / num2; // double과 int 연산 시 double로 자동 형변환 수행
        return (int) Math.floor(divide * 1000); 
    }
}

// Math.floor(double a)
// 소수점 내림 함수

// 방법 2
// (int)((double) num1 / num2 * 1000)
// 1. (double) num1 / num2 * 1000 -> 값
// 2. (int) 값 -> 소수점 이하 손실