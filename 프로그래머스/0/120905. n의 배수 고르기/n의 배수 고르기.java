import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        return IntStream.of(numlist)
                        .filter(num -> num % n == 0)
                        .toArray();
    }
}

// 다른 풀이
int count = 0;
for(int i : numlist){
    if(i%n==0){
        count++;
    }
}

int[] answer = new int[count];
int idx = 0;
for(int i : numlist){
    if(i%n==0){
        answer[idx]=i;
        idx++;
    }
}

return answer;
