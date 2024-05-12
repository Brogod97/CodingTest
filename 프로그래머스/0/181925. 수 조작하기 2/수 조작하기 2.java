class Solution {
    public String solution(int[] numLog) {
        String answer = "";        
        int prev = numLog[0];
        
        for(int num : numLog) {
            if((prev - num) == -1) answer += "w";
            if((prev - num) == 1) answer += "s";
            if((prev - num) == -10) answer += "d";
            if((prev - num) == 10) answer += "a";
            prev = num;
        }
        
        return answer;
    }
}

// 다른 풀이
 String answer = "";
for(int i=1; i<numLog.length; i++){
    int j = numLog[i-1] - numLog[i];
    switch(j){
        case -1 : answer+='w'; break;
        case 1 : answer+='s'; break;
        case -10 : answer+='d'; break;
        case 10 : answer+='a'; break;
    }
}
return answer;
