import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(char c : a.toCharArray()) {
            if(Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}

// 출력구문을 두번 작성하지 않고, String answer 변수를 선언하여 관리하는 방법도 괜찮을듯

// 다른 풀이
for(int i=0; i<a.length(); i++) {
    char c = a.charAt(i);
    if(Character.isUpperCase(c)) {
        System.out.print((char)(c+32));
    }
    else {
        System.out.print((char)(c-32));
    }
}
// 32의 의미 : ASCII 코드에서 대문자 / 소문자 간 차이
// 예시 - A = 65, a = 97
