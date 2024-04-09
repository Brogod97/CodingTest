import java.util.*; 

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}

// 다른 풀이
return Arrays.stream(numList).sorted().skip(5).toArray();
