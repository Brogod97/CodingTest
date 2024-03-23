import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        
        return IntStream.rangeClosed(0, n)
                        .filter(i -> i % 2 == 1)
                        .toArray();
    }
}

// 다른 풀이
int cnt = 0;

if(n % 2 == 0) cnt = n/2;
else cnt = n/2 + 1;

int[] result = new int[cnt];
int num = 1;

for(int i=0; i<result.length; i++){
    result[i] = num;
    num = num + 2;
}

return result;
