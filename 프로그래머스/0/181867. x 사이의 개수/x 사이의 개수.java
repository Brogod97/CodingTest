import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        
        return Arrays.stream(myString.split("x", myString.length()))
              .mapToInt(str -> str.length()) // .mapToInt(String::length)
              .toArray();
    }
}

// 다른 풀이
return Arrays.stream(myString.split("x", -1)).map(String::length).toArray(Integer[]::new);
// split(String regex, int limit) : limit을 -1로 전달하면 분할된 문자열에 제한 없이 모두 배열에 포함
// mapToInt() : IntStream 반환
// map() : Stream<Integer> 반
