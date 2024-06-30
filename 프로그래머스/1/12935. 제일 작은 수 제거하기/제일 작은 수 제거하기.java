import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> answer = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i : arr) {
            min = Math.min(i, min);
        }
        
        for (int i : arr) {
            if(i != min){
                answer.add(i);
            }
        }
        
        if(answer.size() == 0) {
            return new int[]{-1};
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

// 다른 풀이
if (arr.length <= 1) return new int[]{ -1 };
int min = Arrays.stream(arr).min().getAsInt();
return Arrays.stream(arr).filter(i -> i != min).toArray();

// 다른 풀이
List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
Arrays.sort(arr);
list.remove(list.indexOf(arr[0]));
if (list.size() <= 0) return new int[]{-1};
return list.stream().mapToInt(i->i).toArray();
