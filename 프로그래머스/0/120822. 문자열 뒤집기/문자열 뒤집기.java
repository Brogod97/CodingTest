class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        return sb.reverse().toString();
    }
}

/* StringBuilder
    - 설명: Java에서 문자열을 변경할 때 사용되는 유용한 클래스

    - 생성 방법
        1. 기본 생성: StringBuilder sb = new StringBuilder();   
        2. 초기 문자열로 생성: StringBuilder sb = new StringBuilder("Hello");

    - 주요 메서드
        - append(String str): 지정된 문자열을 현재 StringBuilder에 추가
        - insert(int offset, String str): 지정된 위치에 문자열을 삽입
        - delete(int start, int end): 지정된 범위의 문자열을 삭제
        - deleteCharAt(int index): 지정된 인덱스의 문자를 삭제
        - replace(int start, int end, String str): 지정된 범위의 문자열을 주어진 문자열로 대체
        - substring(int start): 지정된 위치부터 끝까지의 부분 문자열을 반환
        - substring(int start, int end): 지정된 범위의 부분 문자열을 반환
        - reverse(): 문자열을 뒤집기
*/
