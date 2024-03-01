class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = num_list[size - 1 - i];
        }
        
        return answer;
    }
}

// 다른 풀이 1
List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
Collections.reverse(list);
return list.stream().mapToInt(Integer::intValue).toArray();

// Arrays.stream(): 배열을 스트림으로 변환
// boxed(): 기본형 스트림을 객체 스트림으로 변환 (IntStream -> Stream<Integer>)
// collect(Collectors.toList()): 스트림의 요소를 리스트에 저장하여 반환

// 다른 풀이 2
return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
// 1부터 num_list.length + 1까지 범위의 LongStream 생성
// mapToInt를 이용해 num_list의 값 새로 세팅
// .toArray()를 이용해 배열로 반환
