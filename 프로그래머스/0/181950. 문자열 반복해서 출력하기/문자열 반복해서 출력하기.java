import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}

// 다른 풀이
System.out.println(str.repeat(n));
// String.repeat(n)
// - Java 11에서 새로 추가된 Stirng 메서드, 문자열을 파라미터의 주어진 횟수만큼 반복
// - 파라미터가 0일 경우, 빈 문자열 반환
// - 음수일 경우, IllegalArgumentExceptionthrow 반환
// - 1일 경우, 문자열 그대로 반환

// 다른 풀이
StringBuilder sb = new StringBuilder();
for(int i=0; i<n; i++){
    sb.append(str);
}
System.out.println(sb.toString());
