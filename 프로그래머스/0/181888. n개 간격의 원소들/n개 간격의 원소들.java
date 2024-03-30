class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = 0;
        if(num_list.length % n == 0) 
            size = num_list.length / n;
        else 
            size = num_list.length / n + 1;
        
        int[] answer = new int[size];
        
        for(int i = 0, j = 0; i < num_list.length; i += n, j++){
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}

// 다른 풀이
return IntStream.iterate(0, i -> i < numList.length, i -> i + n)
                .map(i -> numList[i])
                .toArray();
// .iterate() : 초기 값과 조건, 그리고 요소를 생성하는 함수를 인자로 받음
//    - 초기값 : 0
//    - 조건 : i -> i < numList.length
//    - 값 변경 함수 : i -> i + n
