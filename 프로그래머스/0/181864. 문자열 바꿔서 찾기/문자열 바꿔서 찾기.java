class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        
        for(String str : myString.split("")) {
            answer += "A".equals(str) ? "B" : "A";
        }
        
        return answer.contains(pat) ? 1 : 0;
    }
}

// 다른 풀이
myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
return myString.contains(pat) ? 1 : 0;

// 다른 풀이
return myString.chars()
               .mapToObj(c -> String.valueOf((char) (c == 65 ? c + 1 : c - 1)))
               .collect(Collectors.joining())
               .contains(pat) ? 1 : 0;
