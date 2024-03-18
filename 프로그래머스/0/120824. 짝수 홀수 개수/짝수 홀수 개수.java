class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int count = 0;
        for(int num : num_list) {
            if(num % 2 == 0) {
                count++;
            }
        }
        
        answer[0] = count;
        answer[1] = num_list.length - count;
        
        return answer;
    }
}

// 다른 풀이
 int[] answer = new int[2];

for(int i = 0; i < num_list.length; i++)
    answer[num_list[i] % 2]++;

return answer;

// 다른 풀이
return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
