class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        for(String str : arr) {
            answer += str;
        }
        
        return answer;
    }
}

// 다른 풀이
return String.join("", arr);

// 다른 풀이
return Arrays.stream(arr).collect(Collectors.joining());
