class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < my_strings.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        
        return answer;
    }
}

// 다른 풀이
 return IntStream.range(0, myStrings.length)
                 .mapToObj(i -> myStrings[i].substring(parts[i][0], parts[i][1] + 1))
                 .collect(Collectors.joining());
