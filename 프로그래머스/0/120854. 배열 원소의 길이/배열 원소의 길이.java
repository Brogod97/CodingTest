class Solution {
    public int[] solution(String[] strlist) {
        int size = strlist.length;
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}

// 다른 풀이
return Arrays.stream(strList).mapToInt(String::length).toArray();
// Arrays.stream(strList): strList를 스트림으로 변환
/* .mapToInt(String::length)
    - mapToInt(): 스트림의 각 요소를 특정한 방식으로 변환 후 정수 스트림 생성

    - 메소드 레퍼런스 (클래스::메소드) : 람다식과 같은 기능, 다만 메소드를 참조하여 호출
    -- String::length == String객체의 length() 호출
*/
