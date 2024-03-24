class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]","");
        
        for(String str : my_string.split("")) {
            answer += Integer.parseInt(str);
        }
        
        return answer;
    }
}

// 다른 풀이
return myString.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isDigit) // isDigit() : char 값이 숫자 인지 여부를 판단하여 boolean으로 반환
                .map(String::valueOf)       // String.valueOf() : String으로 변환 
                .mapToInt(Integer::valueOf) // Integer.valueOf() : 문자열을 정수로 변환 (Integer 타입으로 반환)
                .sum();

// 다른 풀이
int answer = 0;
String str = my_string.replaceAll("[^0-9]","");

for(char ch : str.toCharArray()) {
    answer += Character.getNumericValue(ch); // 숫자 형태 char -> int로 변환
}

return answer;

// 다른 풀이
int answer = 0;

for(char c : my_string.toCharArray()){
    if(c >= '0' && c <= '9'){
        answer += c - '0';
    }
}
return answer;
