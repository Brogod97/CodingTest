import java.util.stream.*;

class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        int size = numbers.length;
        
        for(int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        return sum / size;
    }
}

// 다른 풀이
// return Arrays.stream(numbers).average().orElse(0);
// Arrays.stream(numbers) : numbers 배열을 스트림으로 변환
// .average() : 스트림 요소들의 평균 값 반환
// .orElse(0) : 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려줌
