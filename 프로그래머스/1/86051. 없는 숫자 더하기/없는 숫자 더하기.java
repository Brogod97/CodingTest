class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        
        for(int i = 0 ; i <= 9; i++){
            max += i;
            for(int num : numbers) {
                if(num == i) {
                    answer += i;
                    break;
                } 
            }
        }
        
        return max - answer;
    }
}

// 다른 풀이
int sum = 45;
for (int i : numbers) {
    sum -= i;
}
return sum;

// 다른 풀이
return 45 - Arrays.stream(numbers).sum();

// 다른 풀이
return IntStream.rangeClosed(0, 9)
                .filter(i -> Arrays.stream(numbers)
                .noneMatch(num -> i == num))
                .sum();
