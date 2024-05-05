import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger aNum = new BigInteger(a);
        BigInteger bNum = new BigInteger(b);
        
        answer += aNum.add(bNum);
        
        return answer;
    }
}