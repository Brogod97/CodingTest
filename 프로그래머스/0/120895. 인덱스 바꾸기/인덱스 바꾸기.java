class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strArr = my_string.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            
            if(i == num1) {
                answer += strArr[num2];    
                continue;
            } else if(i == num2) {
                answer += strArr[num1];    
                continue;
            }
            
            answer += strArr[i];
        }
        
        return answer;
    }
}

// 다른 풀이
String answer = "";

char[] ch = my_string.toCharArray();

ch[num1] = my_string.charAt(num2);
ch[num2] = my_string.charAt(num1);

answer = String.valueOf(ch);
return answer;

// 다른 풀이
List<String> list = Arrays.stream(myString.split(""))
                          .collect(Collectors.toList());

Collections.swap(list, num1, num2);
return String.join("", list);
