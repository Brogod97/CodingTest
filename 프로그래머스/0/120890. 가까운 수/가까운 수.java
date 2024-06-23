class Solution {
    public int solution(int[] array, int n) {
        int result = array[0];
        
        for(int i : array) {
            int fix = Math.abs(result - n);
            int curr = Math.abs(i - n);
            
            if (fix > curr || (fix == curr && result > i)) {
                result = i;
            }
        }

        return result;
    }
}

// 다른 풀이
return Math.min(array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).indexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))], array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).lastIndexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))]);
