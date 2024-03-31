class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for(int num : num_list) {
            sum += num;
            mul *= num;
        }
        
        return mul < sum * sum ? 1 : 0;
    }
}

// 다른 풀이
return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
// reduce() : 스트림의 요소를 줄이고(reduce) 하나의 값으로 결합하는 데 사용
// Math.pow(밑, 지수)
