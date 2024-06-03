class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i : array){
            for(String str : (i + "").split("")) {
                answer += str.equals("7") ? 1 : 0;
            }
        }
        
        return answer;
    }
}

// 다른 풀이
return (int) Arrays.stream(
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining())
                        .split("")
        )
        .filter(s -> s.equals("7"))
        .count();

// 다른 풀이
int answer = 0;
for(int a : array){
    while(a != 0){
        if(a % 10 == 7){
            answer++;
        }
        a /= 10;
    }
}
return answer;
