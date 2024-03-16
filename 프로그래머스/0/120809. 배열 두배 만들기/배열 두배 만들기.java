import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        
        return IntStream.of(numbers)
                        .map(i -> i * 2)
                        .toArray();
    }
}

// 다른 풀이
for(int i=0; i<numbers.length; i++) numbers[i] *= 2;
return numbers;
