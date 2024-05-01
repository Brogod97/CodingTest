class Solution {
    public String solution(String myString) {
        String answer = "";

        // a = 97 ... l = 108
        for(int i = 0; i < myString.length(); i++) {
            answer += myString.charAt(i) < 108 ? "l" : myString.charAt(i);
        }
        
        return answer;
    }
}

// 다른 풀이
return myString.replaceAll("[^l-z]", "l");

// 다른 풀이
return myString.chars()
               .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
               .collect(Collectors.joining());
