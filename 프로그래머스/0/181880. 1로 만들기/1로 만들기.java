class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int num : num_list) {
            while(num != 1){
                num = num % 2 == 0 ? num / 2 : (num - 1) / 2; // 참고: int 타입이라 / 연산 시 -1을 안해도 절삭됨
                answer++;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
return Arrays.stream(num_list)
             .map(i -> Integer.toBinaryString(i).length() - 1)
             .sum();
