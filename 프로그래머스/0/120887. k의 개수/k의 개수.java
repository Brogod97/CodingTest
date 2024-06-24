class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++) {
            for(String numStr : (x+"").split("")){
                if(Integer.valueOf(numStr) == k) {
                    answer++;
                }    
            }
            
        }
        
        return answer;
    }
}

// 다른 풀이
String str = "";
for(int a = i; a <= j; a++) {
    str += a+"";
}

return str.length() - str.replace(k+"", "").length();

// 다른 풀이
 return (int) Arrays.stream(IntStream.rangeClosed(i, j)
                        .mapToObj(String::valueOf)
                        .flatMap(String::lines)
                        .collect(Collectors.joining())
                        .split(""))
                        .filter(s -> s.equals(String.valueOf(k)))
                        .count();
