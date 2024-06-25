class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            for(int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[numbers.length-1];
        } else {
            for(int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[numbers.length-1] = numbers[0];
        }
        
        return answer;
    }
}

// 다른 풀이
List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

if (direction.equals("right")) {
    list.add(0, list.get(list.size() - 1));
    list.remove(list.size() - 1);
} else {
    list.add(list.size(), list.get(0));
    list.remove(0);
}
return list.stream().mapToInt(Integer::intValue).toArray();
