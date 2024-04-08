class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int idx = 0;
        
        for(String str: strArr) {
            answer[idx] = idx % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
            idx++;
        }
        
        return answer;
    }
}

// 다른 풀이
return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new); // 새로운 String 배열 생성
