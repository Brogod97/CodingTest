import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int[] order = emergency.clone();
        Arrays.sort(order);
        
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(order[i] == emergency[j]) {
                    answer[j] = len - i;
                }
            }
        }
            
        return answer;
    }
}

// 다른 풀이
return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();

// 다른 풀이
int[] answer = new int[emergency.length];

for(int i = 0; i < answer.length; i++){
    if(answer[i] != 0){
        continue;
    }
    int idx = 1;
    for(int j = 0; j < answer.length; j++){
        if(emergency[i] < emergency[j]){
            idx++;
        }
    }
    answer[i] = idx;
}
return answer;
