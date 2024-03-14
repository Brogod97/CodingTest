import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

// 다른 풀이
int[] answer = new int[num2 - num1 + 1];

for (int i = num1; i <= num2; i++) {
    answer[i -num1] = numbers[i];
}

return answer;

// 다른 풀이
return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();

// 다른 풀이
return Arrays.stream(numbers, num1, num2+1).toArray();
