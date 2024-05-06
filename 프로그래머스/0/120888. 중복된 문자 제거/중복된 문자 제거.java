class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(String str : my_string.split("")){
            if(answer.contains(str)) {
                continue;
            }
            answer += str;
        }
        
        return answer;
    }
}

// 다른 풀이
return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());

// 다른 풀이
String[] answer = my_string.split("");
Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

return String.join("", set);

// 다른 풀이
String answer = "";

for(int i=0; i<my_string.length(); i++){
    //my_string.indexOf(my_string.charAt(i));
    if(i==my_string.indexOf(my_string.charAt(i)))
        answer+=my_string.charAt(i);
}

return answer;

// 다른 풀이
return Arrays.stream(myString.split(""))
             .distinct()
             .collect(Collectors.joining());