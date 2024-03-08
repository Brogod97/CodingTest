class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(String str : Integer.toString(n).split("")){
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}

// 다른 답안
while(n>0){
    answer+=n%10;
    n/=10;
}

// 다른 답안
return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
