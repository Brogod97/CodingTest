class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}

// IntStream을 이용한 풀이
// import java.util.stream.IntStream;
// 
// return IntStream.rangeClosed(0, n)
//                 .filter(i -> i % 2 == 0)
//                 .sum();

// IntStream : Java 8에서 도입된 Java Stream API의 일부로, 원시 int 값의 스트림을 처리하기 위한 것
// .rangeClosed(start, end): 시작부터 끝까지(포함)의 순차적인 IntStream을 생성 
// .range(start, end): rangeClosed와 유사하지만, 시작은 포함하고 끝은 포함하지 않는 스트림을 생성
// .filter(): Predicate를 인수로 받아 해당 조건을 만족하는 요소로 구성된 스트림을 반환
// .sum(): 스트림의 요소들의 합을 계산하여 결과를 int로 반환