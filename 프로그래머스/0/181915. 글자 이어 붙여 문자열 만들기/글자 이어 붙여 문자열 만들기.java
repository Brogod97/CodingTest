class Solution {
    public String solution(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();
        
        for (int index : index_list) {
            sb.append(my_string.charAt(index));
        }
        
        return sb.toString();
    }
}

// 다른 풀이
String answer = "";
        
for(int i = 0; i < index_list.length; i++) {
    int index = index_list[i];
    answer += my_string.charAt(index);
}

return answer;

// 다른 풀이
return Arrays.stream(indexList)
             .mapToObj(operand -> String.valueOf(myString.charAt(operand)))
             .collect(Collectors.joining());

// 다른 풀이
String answer = "";
String[] str = my_string.split("");
for(int index : index_list) {
    answer += str[index];
}
return answer;
