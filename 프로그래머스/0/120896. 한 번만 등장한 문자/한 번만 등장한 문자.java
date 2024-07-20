import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        Arrays.sort(arr);
        for(String s1 : arr){
            int cnt = 0;
            
            for(String s2 : arr){
                if(s1.equals(s2)) cnt++;
            }
            
            if(cnt == 1) answer += s1;         
        }
        
        return answer;
    }
}

// 다른 풀이
return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() <= 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());

// 다른 풀이
int[] alpha = new int[26];
for(char c : s.toCharArray()){
    alpha[c - 'a']++;
}

StringBuilder answer = new StringBuilder();
for(int i = 0; i < 26; i++){
    if(alpha[i] == 1){
        answer.append((char)(i + 'a'));
    }
}
return answer.toString();
