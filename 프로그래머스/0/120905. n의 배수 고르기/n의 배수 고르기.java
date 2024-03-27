import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        return IntStream.of(numlist)
                        .filter(num -> num % n == 0)
                        .toArray();
    }
}