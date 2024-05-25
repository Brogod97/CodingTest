import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        
        return IntStream.rangeClosed(1, n)
                        .filter(i -> n % i == 0)
                        .toArray();
    }
}

// 다른 풀이
 List<Integer> answer = new ArrayList<>();
for(int i=1; i<=n; i++){
    if(n % i == 0){
        answer.add(i);
    }
}
return answer.stream().mapToInt(x -> x).toArray();
