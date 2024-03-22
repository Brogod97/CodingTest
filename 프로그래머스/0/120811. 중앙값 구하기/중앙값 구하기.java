import java.util.*; 

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        
        return array[array.length / 2];
    }
}

// 다른 풀이
 int answer = 0;

for (int i = 0; i < array.length; i++) {
    for (int j = i; j < array.length; j++) {
        if (array[j] < array[i]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

answer = array[array.length / 2];

return answer;
