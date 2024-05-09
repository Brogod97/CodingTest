class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(String num : number.split("")) {
            answer += Integer.parseInt(num);
        }
        
        return answer % 9;
    }
}

// 다른 풀이
return number.chars()
             .map(c -> (c - '0') % 9)
             .sum() % 9;

// 다른 풀이
BigInteger x = new BigInteger(number);
BigInteger y = new BigInteger("9");
String ans = "";
ans += x.remainder(y);
int answer = Integer.parseInt(ans);
return answer;
