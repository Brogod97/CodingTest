class Solution {
    public int solution(int order) {
        int answer = 0;
        String THREE_SIX_NINE = "3,6,9";
        
        for(String str: (String.valueOf(order)).split("")){
            if(THREE_SIX_NINE.contains(str)){
                answer++;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
 int answer = 0;
int count = 0;
while(order != 0)
{
    if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9)
    {
        count++;
    }
     order = order/10;
}
answer = count;
return answer;

// 다른 풀이
return (int) Arrays.stream(String.valueOf(order).split(""))
                   .map(Integer::parseInt)
                   .filter(i -> i == 3 || i == 6 || i == 9)
                   .count();

// 다른 풀이
private static final Pattern PATTERN = Pattern.compile("[369]");

public int solution(int order) {
    Matcher matcher = PATTERN.matcher(String.valueOf(order));
    return (int) Stream.generate(() -> "")
            .takeWhile(__ -> matcher.find())
            .count();
}
