class Solution {
    public String solution(String myString) {
        
        return myString.toLowerCase().replaceAll("a", "A");
    }
}

// 다른 풀이
return myString.chars()
               .mapToObj(c -> String.valueOf((char) (c == 97 || c == 65 ? Character.toUpperCase(c) : Character.toLowerCase(c))))
               .collect(Collectors.joining());
